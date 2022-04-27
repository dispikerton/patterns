package ru.zolotenkov.patterns.abstractfactory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VictorianChair implements Chair {
  private final Logger logger = LoggerFactory.getLogger(VictorianChair.class);

  @Override
  public void info() {
    logger.info("Викторианский стул");
  }
}
