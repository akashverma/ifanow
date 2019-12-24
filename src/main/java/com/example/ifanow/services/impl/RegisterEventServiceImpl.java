package com.example.ifanow.services.impl;

import com.example.ifanow.entities.Event;
import com.example.ifanow.entities.dtos.EventRequest;
import com.example.ifanow.repositories.EventRepository;
import com.example.ifanow.services.AdminRulesInterface;
import com.example.ifanow.services.RegisterEventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Spring service implementation layer for register event service
 *
 * @author akashverma
 * @version 1.0.0
 */
@Service
public class RegisterEventServiceImpl implements RegisterEventService {

    /**
     * class level private static logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterEventServiceImpl.class);

    /**
     * spring resolved event repo bean
     */
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private AdminRulesInterface adminRulesInterface;

    /**
     * {@inheritDoc}
     */
    @Override
    public void register(EventRequest eventRequest) {

        //check if incoming userId is first time and noun + verb combination is bill pay then trigger push notification.
        if (!eventRepository.existsByUserId(eventRequest.getUserId()) && eventRequest.getNoun().equalsIgnoreCase("bill")
                && eventRequest.getVerb().equalsIgnoreCase("pay")) {
            adminRulesInterface.pushNotification(eventRequest);
        }

        Event event = new Event();
        event.setLatitude(eventRequest.getLatitude());
        event.setLongitude(eventRequest.getLongitude());
        event.setNoun(eventRequest.getNoun());
        event.setVerb(eventRequest.getVerb());
        event.setTimespent(eventRequest.getTimespent());
        event.setTimestamp(String.valueOf(eventRequest.getTimestamp()));
        event.setUserId(eventRequest.getUserId());
        LOGGER.info("New event about to be persisted-----------");
        eventRepository.save(event);
        LOGGER.info("The event was persisted successfully-------");
    }
}
