package com.example.ifanow.services;

import com.example.ifanow.entities.dtos.EventRequest;

/**
 * The central API contract for admin interface. It defines all applicable business rules.
 *
 * @author akashverma
 * @version 1.0.0
 */
public interface AdminRulesInterface {
    /**
     * Trigger a push notification on very first bill pay event for the user
     */
    void pushNotification(EventRequest eventRequest);

    /**
     * Alert user if 5 or more bill pay events of total value >= 20000 happen within 5
     * minutes time window
     */
    void alertUser();

    /**
     * Alert IFANOW operator if bill paid, but did not give feedback within 15 minutes of the
     * bill pay event (bill pay, feedback posted are 2 different events)
     */
    void alertOperator();
}
