package ru.zolotenkov.patterns.bridge.model;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Refrigerator extends Trailer {
    private final Logger logger = LoggerFactory.getLogger(Refrigerator.class);
    @Override
    public void load() {
        logger.info("Load refrigerator");
    }
}
