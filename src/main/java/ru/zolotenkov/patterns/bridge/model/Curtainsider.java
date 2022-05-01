package ru.zolotenkov.patterns.bridge.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Curtainsider extends Trailer {
    private final Logger logger = LoggerFactory.getLogger(Curtainsider.class);
    @Override
    public void load() {
        logger.info("Load curtainsider");
    }
}
