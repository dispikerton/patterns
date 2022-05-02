package ru.zolotenkov.patterns.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Worker {
    private final Logger logger = LoggerFactory.getLogger(Worker.class);

    void lay(Brick brick) {
        logger.info("Laying brick {}", brick);
    }
}
