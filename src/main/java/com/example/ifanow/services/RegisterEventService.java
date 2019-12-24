package com.example.ifanow.services;

import com.example.ifanow.entities.dtos.EventRequest;

/**
 * the central api contract for registering various user events
 */
public interface RegisterEventService {
    /**
     * abstract method for registering event
     *
     * @param eventRequest - the incoming event request
     */
    void register(EventRequest eventRequest);
}
