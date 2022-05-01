package ru.zolotenkov.patterns.bridge.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Saddle extends Tractor {

    private final Logger logger = LoggerFactory.getLogger(Saddle.class);

    public Saddle() {
    }

    public Saddle(Trailer trailer) {
        super(trailer);
    }

    public void move() {
        logger.info("Saddle moving");
    }
}
