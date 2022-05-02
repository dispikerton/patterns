package ru.zolotenkov.patterns.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bricklayer {
    private final Logger logger = LoggerFactory.getLogger(Bricklayer.class);

    void lay(Brick brick) {
        logger.info("Laying brick {}", brick);
    }
}
