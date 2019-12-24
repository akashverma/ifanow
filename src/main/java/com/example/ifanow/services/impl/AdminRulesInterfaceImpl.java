package com.example.ifanow.services.impl;

import com.example.ifanow.entities.dtos.EventRequest;
import com.example.ifanow.services.AdminRulesInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * spring service implementation layer for implementing the admin interface rules based on certain criterion
 *
 * @author akashverma
 * @version 1.0.0
 */
@Service
public class AdminRulesInterfaceImpl implements AdminRulesInterface {

    /**
     * private level static class logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminRulesInterface.class);

    @Override
    public void pushNotification(EventRequest eventRequest) {
        LOGGER.info("Push Notification was sent to user with id: " + eventRequest.getUserId());
    }

    @Override
    public void alertUser() {

    }

    @Override
    public void alertOperator() {

    }
}
