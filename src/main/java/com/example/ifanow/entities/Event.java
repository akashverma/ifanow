package com.example.ifanow.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class represents the event table
 *
 * @author akashverma
 * @version 1.0.0
 */
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id", columnDefinition = "int(11)")
    private int userId;

    @Column(name = "timestamp", columnDefinition = "char(15)")
    private String timestamp;

    @Column(name = "latitude", columnDefinition = "char(10)")
    private String latitude;

    @Column(name = "longitude", columnDefinition = "char(10)")
    private String longitude;

    @Column(name = "noun", columnDefinition = "char(10)")
    private String noun;

    @Column(name = "verb", columnDefinition = "char(10)")
    private String verb;

    @Column(name = "time_spent", columnDefinition = "int(11)")
    private int timespent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
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

    public int getTimespent() {
        return timespent;
    }

    public void setTimespent(int timespent) {
        this.timespent = timespent;
    }
}
