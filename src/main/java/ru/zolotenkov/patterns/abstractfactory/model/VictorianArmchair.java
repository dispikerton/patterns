package ru.zolotenkov.patterns.abstractfactory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VictorianArmchair implements Armchair, Furniture {

  private final Logger logger = LoggerFactory.getLogger(VictorianArmchair.class);

  @Override
  public void info() {
    logger.info("Викторианский диван");
  }
}
