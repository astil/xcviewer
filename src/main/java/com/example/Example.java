
package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "resource_state",
    "external_id",
    "upload_id",
    "athlete",
    "name",
    "distance",
    "moving_time",
    "elapsed_time",
    "total_elevation_gain",
    "type",
    "start_date",
    "start_date_local",
    "timezone",
    "start_latlng",
    "end_latlng",
    "location_city",
    "location_state",
    "location_country",
    "start_latitude",
    "start_longitude",
    "achievement_count",
    "kudos_count",
    "comment_count",
    "athlete_count",
    "photo_count",
    "map",
    "trainer",
    "commute",
    "manual",
    "private",
    "flagged",
    "gear_id",
    "average_speed",
    "max_speed",
    "average_cadence",
    "average_temp",
    "has_heartrate",
    "elev_high",
    "elev_low",
    "total_photo_count",
    "has_kudoed"
})
public class Example {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("external_id")
    private String externalId;
    @JsonProperty("upload_id")
    private Integer uploadId;
    @JsonProperty("athlete")
    private Athlete athlete;
    @JsonProperty("name")
    private String name;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("moving_time")
    private Integer movingTime;
    @JsonProperty("elapsed_time")
    private Integer elapsedTime;
    @JsonProperty("total_elevation_gain")
    private Double totalElevationGain;
    @JsonProperty("type")
    private String type;

    @JsonFormat
        (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")//"dd-MM-yyyy hh:mm:ss")
    @JsonProperty("start_date")
    private Date startDate;
    @JsonProperty("start_date_local")
    private String startDateLocal;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("start_latlng")
    private List<Double> startLatlng = new ArrayList<Double>();
    @JsonProperty("end_latlng")
    private List<Double> endLatlng = new ArrayList<Double>();
    @JsonProperty("location_city")
    private Object locationCity;
    @JsonProperty("location_state")
    private Object locationState;
    @JsonProperty("location_country")
    private String locationCountry;
    @JsonProperty("start_latitude")
    private Double startLatitude;
    @JsonProperty("start_longitude")
    private Double startLongitude;
    @JsonProperty("achievement_count")
    private Integer achievementCount;
    @JsonProperty("kudos_count")
    private Integer kudosCount;
    @JsonProperty("comment_count")
    private Integer commentCount;
    @JsonProperty("athlete_count")
    private Integer athleteCount;
    @JsonProperty("photo_count")
    private Integer photoCount;
    @JsonProperty("map")
    private com.example.Map map;
    @JsonProperty("trainer")
    private Boolean trainer;
    @JsonProperty("commute")
    private Boolean commute;
    @JsonProperty("manual")
    private Boolean manual;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("flagged")
    private Boolean flagged;
    @JsonProperty("gear_id")
    private Object gearId;
    @JsonProperty("average_speed")
    private Double averageSpeed;
    @JsonProperty("max_speed")
    private Double maxSpeed;
    @JsonProperty("average_cadence")
    private Double averageCadence;
    @JsonProperty("average_temp")
    private Double averageTemp;
    @JsonProperty("has_heartrate")
    private Boolean hasHeartrate;
    @JsonProperty("elev_high")
    private Double elevHigh;
    @JsonProperty("elev_low")
    private Double elevLow;
    @JsonProperty("total_photo_count")
    private Integer totalPhotoCount;
    @JsonProperty("has_kudoed")
    private Boolean hasKudoed;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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

    /**
     * 
     * @return
     *     The externalId
     */
    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    /**
     * 
     * @param externalId
     *     The external_id
     */
    @JsonProperty("external_id")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * 
     * @return
     *     The uploadId
     */
    @JsonProperty("upload_id")
    public Integer getUploadId() {
        return uploadId;
    }

    /**
     * 
     * @param uploadId
     *     The upload_id
     */
    @JsonProperty("upload_id")
    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * 
     * @return
     *     The athlete
     */
    @JsonProperty("athlete")
    public Athlete getAthlete() {
        return athlete;
    }

    /**
     * 
     * @param athlete
     *     The athlete
     */
    @JsonProperty("athlete")
    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The distance
     */
    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The movingTime
     */
    @JsonProperty("moving_time")
    public Integer getMovingTime() {
        return movingTime;
    }

    /**
     * 
     * @param movingTime
     *     The moving_time
     */
    @JsonProperty("moving_time")
    public void setMovingTime(Integer movingTime) {
        this.movingTime = movingTime;
    }

    /**
     * 
     * @return
     *     The elapsedTime
     */
    @JsonProperty("elapsed_time")
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    /**
     * 
     * @param elapsedTime
     *     The elapsed_time
     */
    @JsonProperty("elapsed_time")
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    /**
     * 
     * @return
     *     The totalElevationGain
     */
    @JsonProperty("total_elevation_gain")
    public Double getTotalElevationGain() {
        return totalElevationGain;
    }

    /**
     * 
     * @param totalElevationGain
     *     The total_elevation_gain
     */
    @JsonProperty("total_elevation_gain")
    public void setTotalElevationGain(Double totalElevationGain) {
        this.totalElevationGain = totalElevationGain;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    @JsonFormat
        (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")//"dd-MM-yyyy hh:mm:ss")
    @JsonProperty("start_date")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The start_date
     */
    @JsonFormat
        (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")//"dd-MM-yyyy hh:mm:ss")
    @JsonProperty("start_date")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The startDateLocal
     */
    @JsonProperty("start_date_local")
    public String getStartDateLocal() {
        return startDateLocal;
    }

    /**
     * 
     * @param startDateLocal
     *     The start_date_local
     */
    @JsonProperty("start_date_local")
    public void setStartDateLocal(String startDateLocal) {
        this.startDateLocal = startDateLocal;
    }

    /**
     * 
     * @return
     *     The timezone
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * 
     * @param timezone
     *     The timezone
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * 
     * @return
     *     The startLatlng
     */
    @JsonProperty("start_latlng")
    public List<Double> getStartLatlng() {
        return startLatlng;
    }

    /**
     * 
     * @param startLatlng
     *     The start_latlng
     */
    @JsonProperty("start_latlng")
    public void setStartLatlng(List<Double> startLatlng) {
        this.startLatlng = startLatlng;
    }

    /**
     * 
     * @return
     *     The endLatlng
     */
    @JsonProperty("end_latlng")
    public List<Double> getEndLatlng() {
        return endLatlng;
    }

    /**
     * 
     * @param endLatlng
     *     The end_latlng
     */
    @JsonProperty("end_latlng")
    public void setEndLatlng(List<Double> endLatlng) {
        this.endLatlng = endLatlng;
    }

    /**
     * 
     * @return
     *     The locationCity
     */
    @JsonProperty("location_city")
    public Object getLocationCity() {
        return locationCity;
    }

    /**
     * 
     * @param locationCity
     *     The location_city
     */
    @JsonProperty("location_city")
    public void setLocationCity(Object locationCity) {
        this.locationCity = locationCity;
    }

    /**
     * 
     * @return
     *     The locationState
     */
    @JsonProperty("location_state")
    public Object getLocationState() {
        return locationState;
    }

    /**
     * 
     * @param locationState
     *     The location_state
     */
    @JsonProperty("location_state")
    public void setLocationState(Object locationState) {
        this.locationState = locationState;
    }

    /**
     * 
     * @return
     *     The locationCountry
     */
    @JsonProperty("location_country")
    public String getLocationCountry() {
        return locationCountry;
    }

    /**
     * 
     * @param locationCountry
     *     The location_country
     */
    @JsonProperty("location_country")
    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    /**
     * 
     * @return
     *     The startLatitude
     */
    @JsonProperty("start_latitude")
    public Double getStartLatitude() {
        return startLatitude;
    }

    /**
     * 
     * @param startLatitude
     *     The start_latitude
     */
    @JsonProperty("start_latitude")
    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    /**
     * 
     * @return
     *     The startLongitude
     */
    @JsonProperty("start_longitude")
    public Double getStartLongitude() {
        return startLongitude;
    }

    /**
     * 
     * @param startLongitude
     *     The start_longitude
     */
    @JsonProperty("start_longitude")
    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    /**
     * 
     * @return
     *     The achievementCount
     */
    @JsonProperty("achievement_count")
    public Integer getAchievementCount() {
        return achievementCount;
    }

    /**
     * 
     * @param achievementCount
     *     The achievement_count
     */
    @JsonProperty("achievement_count")
    public void setAchievementCount(Integer achievementCount) {
        this.achievementCount = achievementCount;
    }

    /**
     * 
     * @return
     *     The kudosCount
     */
    @JsonProperty("kudos_count")
    public Integer getKudosCount() {
        return kudosCount;
    }

    /**
     * 
     * @param kudosCount
     *     The kudos_count
     */
    @JsonProperty("kudos_count")
    public void setKudosCount(Integer kudosCount) {
        this.kudosCount = kudosCount;
    }

    /**
     * 
     * @return
     *     The commentCount
     */
    @JsonProperty("comment_count")
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 
     * @param commentCount
     *     The comment_count
     */
    @JsonProperty("comment_count")
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 
     * @return
     *     The athleteCount
     */
    @JsonProperty("athlete_count")
    public Integer getAthleteCount() {
        return athleteCount;
    }

    /**
     * 
     * @param athleteCount
     *     The athlete_count
     */
    @JsonProperty("athlete_count")
    public void setAthleteCount(Integer athleteCount) {
        this.athleteCount = athleteCount;
    }

    /**
     * 
     * @return
     *     The photoCount
     */
    @JsonProperty("photo_count")
    public Integer getPhotoCount() {
        return photoCount;
    }

    /**
     * 
     * @param photoCount
     *     The photo_count
     */
    @JsonProperty("photo_count")
    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    /**
     * 
     * @return
     *     The map
     */
    @JsonProperty("map")
    public com.example.Map getMap() {
        return map;
    }

    /**
     * 
     * @param map
     *     The map
     */
    @JsonProperty("map")
    public void setMap(com.example.Map map) {
        this.map = map;
    }

    /**
     * 
     * @return
     *     The trainer
     */
    @JsonProperty("trainer")
    public Boolean getTrainer() {
        return trainer;
    }

    /**
     * 
     * @param trainer
     *     The trainer
     */
    @JsonProperty("trainer")
    public void setTrainer(Boolean trainer) {
        this.trainer = trainer;
    }

    /**
     * 
     * @return
     *     The commute
     */
    @JsonProperty("commute")
    public Boolean getCommute() {
        return commute;
    }

    /**
     * 
     * @param commute
     *     The commute
     */
    @JsonProperty("commute")
    public void setCommute(Boolean commute) {
        this.commute = commute;
    }

    /**
     * 
     * @return
     *     The manual
     */
    @JsonProperty("manual")
    public Boolean getManual() {
        return manual;
    }

    /**
     * 
     * @param manual
     *     The manual
     */
    @JsonProperty("manual")
    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    /**
     * 
     * @return
     *     The _private
     */
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * 
     * @param _private
     *     The private
     */
    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
     * 
     * @return
     *     The flagged
     */
    @JsonProperty("flagged")
    public Boolean getFlagged() {
        return flagged;
    }

    /**
     * 
     * @param flagged
     *     The flagged
     */
    @JsonProperty("flagged")
    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    /**
     * 
     * @return
     *     The gearId
     */
    @JsonProperty("gear_id")
    public Object getGearId() {
        return gearId;
    }

    /**
     * 
     * @param gearId
     *     The gear_id
     */
    @JsonProperty("gear_id")
    public void setGearId(Object gearId) {
        this.gearId = gearId;
    }

    /**
     * 
     * @return
     *     The averageSpeed
     */
    @JsonProperty("average_speed")
    public Double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * 
     * @param averageSpeed
     *     The average_speed
     */
    @JsonProperty("average_speed")
    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    /**
     * 
     * @return
     *     The maxSpeed
     */
    @JsonProperty("max_speed")
    public Double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * 
     * @param maxSpeed
     *     The max_speed
     */
    @JsonProperty("max_speed")
    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * 
     * @return
     *     The averageCadence
     */
    @JsonProperty("average_cadence")
    public Double getAverageCadence() {
        return averageCadence;
    }

    /**
     * 
     * @param averageCadence
     *     The average_cadence
     */
    @JsonProperty("average_cadence")
    public void setAverageCadence(Double averageCadence) {
        this.averageCadence = averageCadence;
    }

    /**
     * 
     * @return
     *     The averageTemp
     */
    @JsonProperty("average_temp")
    public Double getAverageTemp() {
        return averageTemp;
    }

    /**
     * 
     * @param averageTemp
     *     The average_temp
     */
    @JsonProperty("average_temp")
    public void setAverageTemp(Double averageTemp) {
        this.averageTemp = averageTemp;
    }

    /**
     * 
     * @return
     *     The hasHeartrate
     */
    @JsonProperty("has_heartrate")
    public Boolean getHasHeartrate() {
        return hasHeartrate;
    }

    /**
     * 
     * @param hasHeartrate
     *     The has_heartrate
     */
    @JsonProperty("has_heartrate")
    public void setHasHeartrate(Boolean hasHeartrate) {
        this.hasHeartrate = hasHeartrate;
    }

    /**
     * 
     * @return
     *     The elevHigh
     */
    @JsonProperty("elev_high")
    public Double getElevHigh() {
        return elevHigh;
    }

    /**
     * 
     * @param elevHigh
     *     The elev_high
     */
    @JsonProperty("elev_high")
    public void setElevHigh(Double elevHigh) {
        this.elevHigh = elevHigh;
    }

    /**
     * 
     * @return
     *     The elevLow
     */
    @JsonProperty("elev_low")
    public Double getElevLow() {
        return elevLow;
    }

    /**
     * 
     * @param elevLow
     *     The elev_low
     */
    @JsonProperty("elev_low")
    public void setElevLow(Double elevLow) {
        this.elevLow = elevLow;
    }

    /**
     * 
     * @return
     *     The totalPhotoCount
     */
    @JsonProperty("total_photo_count")
    public Integer getTotalPhotoCount() {
        return totalPhotoCount;
    }

    /**
     * 
     * @param totalPhotoCount
     *     The total_photo_count
     */
    @JsonProperty("total_photo_count")
    public void setTotalPhotoCount(Integer totalPhotoCount) {
        this.totalPhotoCount = totalPhotoCount;
    }

    /**
     * 
     * @return
     *     The hasKudoed
     */
    @JsonProperty("has_kudoed")
    public Boolean getHasKudoed() {
        return hasKudoed;
    }

    /**
     * 
     * @param hasKudoed
     *     The has_kudoed
     */
    @JsonProperty("has_kudoed")
    public void setHasKudoed(Boolean hasKudoed) {
        this.hasKudoed = hasKudoed;
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
