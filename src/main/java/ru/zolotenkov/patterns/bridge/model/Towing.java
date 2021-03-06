package ru.zolotenkov.patterns.bridge.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Towing extends Tractor {

    private final Logger logger = LoggerFactory.getLogger(Towing.class);

    public Towing() {
    }

    public Towing(Trailer trailer) {
        super(trailer);
    }

    @Override
    public void move() {
        logger.info("Towing moving");
    }

    @Override
    public void load() {
        getTrailer().load();
    }
}
