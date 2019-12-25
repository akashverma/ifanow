package com.example.ifanow.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    /**
     * private level static logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

    /**
     * Handling exception {@link IllegalArgumentException}
     *
     * @param iae - the incoming exception object
     * @return - the error response json
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public ResponseEntity<?> handleIllegalArgument(IllegalArgumentException iae) {
        LOGGER.debug("Handling Illegar Argument exception: ", iae);
        ErrorResponse response = new ErrorResponse();
        response.setErrorCode("400");
        response.setErrorMessage("Bad request encountered");
        return new ResponseEntity<ErrorResponse>(response, HttpStatus.BAD_REQUEST);
    }
}
