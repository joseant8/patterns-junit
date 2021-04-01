package com.patterns.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectricCar implements ICar{

    private static final Logger logger = LoggerFactory.getLogger(ElectricCar.class);

    private int battery;

    @Override
    public void accelerate() {
        if (hasBattery()) {
            logger.info("accelerating the car");
        } else {
            logger.warn("I can not accelerate the car");
        }
    }

    @Override
    public void stop() {
        logger.info("stopping the car");
    }

    public boolean hasBattery() {
        logger.info("checking battery");
        if (battery < 95) {
            logger.warn("the battery is very low :(");
            return false;
        } else {
            logger.info("battery OK :)");
            return true;
        }
    }
}
