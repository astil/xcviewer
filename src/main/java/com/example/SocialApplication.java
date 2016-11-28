/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example;

import java.security.Principal;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.Filter;

import com.example.domain.*;
import com.example.domain.Athlete;
import com.example.repo.ActivityRepository;
import com.example.repo.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.OAuth2ClientAuthenticationProcessingFilter;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.CompositeFilter;

//https://github.com/spring-projects/spring-security-oauth/tree/master/samples
//https://projects.spring.io/spring-security-oauth/docs/tutorial.html
//https://github.com/spring-projects/spring-security-oauth
//https://projects.spring.io/spring-security-oauth/docs/oauth2.html
//https://spring.io/blog/2015/02/03/sso-with-oauth2-angular-js-and-spring-security-part-v

// http://www.jsonschema2pojo.org/

@SpringBootApplication
@RestController
@EnableOAuth2Client
@EnableAuthorizationServer
@Order(6)
public class SocialApplication extends WebSecurityConfigurerAdapter {

	@Autowired
	EventRepository eventRepository;

	@Autowired
	ActivityRepository activityRepository;

	@Autowired
	OAuth2ClientContext oauth2ClientContext;

	@Autowired
	OAuth2RestOperations template;

	private Map<String, String> brukerDistanse = new HashMap<>();

	@Bean
	public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext context) {
		return new OAuth2RestTemplate(resource, context);
	}

	@Bean
	public AuthoritiesExtractor authoritiesExtractor(OAuth2RestOperations template) {
		return map -> {
			String url = (String) map.get("organizations_url");
			@SuppressWarnings("unchecked")
			List<Map<String, Object>> orgs = template.getForObject(url, List.class);
			if (orgs.stream()
				.anyMatch(org -> "spring-projects".equals(org.get("login")))) {
				return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
			}
			throw new BadCredentialsException("Not in Spring Projects origanization");
		};
	}

	@RequestMapping({ "/user", "/me" })
	public Map<String, String> user(Principal principal) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("name", principal.getName());

		HttpEntity<Example[]> activities = template.getForEntity("https://www.strava.com/api/v3/athlete/activities", Example[].class);

		Example[] examples = activities.getBody();

		double sum = 0;

//		Date afterDate = new Date(2016, Calendar.OCTOBER, 1);

		LocalDate localDate = LocalDate.of( 2016 , Month.OCTOBER , 1 );
		Date afterDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

//		System.out.println("Date1 : " +afterDate);

		Date tidligstDatoSett = new Date();
		Date tidligstSkiDatoSett = new Date();
		Date tidligstSkiDatoBrukt = new Date();

		com.example.domain.Athlete athlete = null;

		for(Example e : examples)
		{
			if("NordicSki".equals(e.getType()))
			{
//				System.out.println("StarteDate : " + e.getStartDate());
				if(e.getStartDate().after(afterDate))
				{
//					System.out.println("Sum : " + sum);
					sum += e.getDistance();
//					System.out.println("Resultat sum : " + sum);

					if(e.getStartDate().before(tidligstSkiDatoBrukt))
					{
						tidligstSkiDatoBrukt = e.getStartDate();
					}
				}

				if(e.getStartDate().before(tidligstSkiDatoSett))
				{
					tidligstSkiDatoSett = e.getStartDate();
				}

				if(athlete == null)
				{
					athlete = new Athlete();
					athlete.setAthleteId(Long.valueOf(e.getAthlete().getId()));
					athlete.setName(principal.getName());
				}

				if(!activityRepository.exists(Long.valueOf(e.getId())))
				{
					Activity activity = new Activity();
					activity.setAthlete(athlete);
					activity.setDate(e.getStartDate());
					activity.setDistance(e.getDistance());
					activity.setType(e.getType());
					activity.setActivityId(Long.valueOf(e.getId()));

					if(athlete.getTotalDistance() == null)
					{
						athlete.setTotalDistance(e.getDistance());
					} else
					{
						athlete.setTotalDistance(athlete.getTotalDistance().doubleValue() + e.getDistance().doubleValue());
					}

					activityRepository.save(activity);
				}




			}

			if(e.getStartDate().before(tidligstDatoSett))
			{
				tidligstDatoSett = e.getStartDate();
			}


		}



//		System.out.println("Date2 : " +afterDate);

		System.out.println("Totalt antall meter på ski : " + sum + " siden : " + tidligstSkiDatoBrukt);

		System.out.println("Tidligst ski dato brukt : " + tidligstSkiDatoSett);
		System.out.println("Tidligst dato sett : " + tidligstDatoSett);

//		System.out.println("Date3 : " +afterDate);

		brukerDistanse.put(principal.getName(), Double.toString(sum));

		map.put("distanse", Double.toString(sum));

		Event event = new Event();
		event.setTitle("MinEvent");
		event.setFromDate(new Date());
		event.setToDate(new Date());
		event.setDescription("desc");
		eventRepository.save(event);



		return map;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http.antMatcher("/**").authorizeRequests().antMatchers("/", "/login**", "/webjars/**").permitAll().anyRequest()
				.authenticated().and().exceptionHandling()
				.authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/")).and().logout()
				.logoutSuccessUrl("/").permitAll().and().csrf()
				.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and()
				.addFilterBefore(ssoFilter(), BasicAuthenticationFilter.class);
		// @formatter:on
	}

	@Configuration
	@EnableResourceServer
	protected static class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
		@Override
		public void configure(HttpSecurity http) throws Exception {
			// @formatter:off
			http.antMatcher("/me").authorizeRequests().anyRequest().authenticated();
			// @formatter:on
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SocialApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean oauth2ClientFilterRegistration(OAuth2ClientContextFilter filter) {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(filter);
		registration.setOrder(-100);
		return registration;
	}

	@Bean
	@ConfigurationProperties("github")
	public ClientResources github() {
		return new ClientResources();
	}

    @Bean
    @ConfigurationProperties("strava")
    public ClientResources strava() {
        return new ClientResources();
    }

	@Bean
	@ConfigurationProperties("facebook")
	public ClientResources facebook() {
		return new ClientResources();
	}

	private Filter ssoFilter() {
		CompositeFilter filter = new CompositeFilter();
		List<Filter> filters = new ArrayList<>();
		filters.add(ssoFilter(facebook(), "/login/facebook"));
		filters.add(ssoFilter(github(), "/login/github"));
		filters.add(ssoFilter(strava(), "/login/strava"));
		filter.setFilters(filters);
		return filter;
	}

	private Filter ssoFilter(ClientResources client, String path) {
		OAuth2ClientAuthenticationProcessingFilter oAuth2ClientAuthenticationFilter = new OAuth2ClientAuthenticationProcessingFilter(
				path);
		OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(client.getClient(), oauth2ClientContext);
		oAuth2ClientAuthenticationFilter.setRestTemplate(oAuth2RestTemplate);
		UserInfoTokenServices tokenServices = new UserInfoTokenServices(client.getResource().getUserInfoUri(),
				client.getClient().getClientId());
		tokenServices.setRestTemplate(oAuth2RestTemplate);
		oAuth2ClientAuthenticationFilter.setTokenServices(tokenServices);
		return oAuth2ClientAuthenticationFilter;
	}

}

class ClientResources {

	@NestedConfigurationProperty
	private AuthorizationCodeResourceDetails client = new AuthorizationCodeResourceDetails();

	@NestedConfigurationProperty
	private ResourceServerProperties resource = new ResourceServerProperties();

	public AuthorizationCodeResourceDetails getClient() {
		return client;
	}

	public ResourceServerProperties getResource() {
		return resource;
	}
}
