package com.patterns.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements ICar{

    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    @Override
    public void accelerate() {
        logger.info("accelerating the car");
    }

    @Override
    public void stop() {
        logger.info("stopping the car");
    }
}
