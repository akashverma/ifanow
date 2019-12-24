package com.example.ifanow.entities.dtos;

import com.example.ifanow.entities.MetaProperties;

import javax.validation.constraints.NotNull;

/**
 * This pojo class represents the event payload.
 *
 * @author akashverma
 * @version 1.0.0
 */
public class EventRequest {
    /**
     * It defines the event.
     */
    private String noun;

    /**
     * what action was done by the user, that triggered the event.
     * Noun and verb together identify what exactly happened
     */
    private String verb;

    /**
     * It rep the p.k. of the user within IFANOW system
     */
    @NotNull
    private Integer userId;

    /**
     * It rep. Time of the event, generated at source - not null
     */
    @NotNull
    private Long timestamp;

    /**
     * Location of event, generated at source
     */
    private String latitude;
    private String longitude;


    /**
     * this is the time spent in seconds on that screen. [If a user is on a mobile screen for n
     * seconds( - measured from the time the screen was opened) before the event got
     * generated, then the value n is passed in this field]
     */
    private Integer timespent;

    /**
     * This defines the meta-data of a particular event.
     * It varies from event to event.
     * e..g it may contain info values of a bill pay txn
     */
    private MetaProperties properties;

    //GETTERS & SETTERS

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getTimespent() {
        return timespent;
    }

    public void setTimespent(Integer timespent) {
        this.timespent = timespent;
    }

    public MetaProperties getProperties() {
        return properties;
    }

    public void setProperties(MetaProperties properties) {
        this.properties = properties;
    }
}
