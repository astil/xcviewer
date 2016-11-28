
package com.example;

import java.util.HashMap;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "summary_polyline",
    "resource_state"
})
public class Map {

    @JsonProperty("id")
    private String id;
    @JsonProperty("summary_polyline")
    private String summaryPolyline;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The summaryPolyline
     */
    @JsonProperty("summary_polyline")
    public String getSummaryPolyline() {
        return summaryPolyline;
    }

    /**
     * 
     * @param summaryPolyline
     *     The summary_polyline
     */
    @JsonProperty("summary_polyline")
    public void setSummaryPolyline(String summaryPolyline) {
        this.summaryPolyline = summaryPolyline;
    }

    /**
     * 
     * @return
     *     The resourceState
     */
    @JsonProperty("resource_state")
    public Integer getResourceState() {
        return resourceState;
    }

    /**
     * 
     * @param resourceState
     *     The resource_state
     */
    @JsonProperty("resource_state")
    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    @JsonAnyGetter
    public java.util.Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
