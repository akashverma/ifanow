package com.example.ifanow.utils;

/**
 * This class contains various validation utilities.
 *
 * @author akashverma
 * @version 1.0.0
 */
public class ValidationUtil {
    /**
     * assert that the incoming parameter is not empty or null
     */
    public static void assertNotNull(Integer input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
    }
}
