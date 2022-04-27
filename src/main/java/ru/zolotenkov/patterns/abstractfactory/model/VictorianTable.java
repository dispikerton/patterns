package ru.zolotenkov.patterns.abstractfactory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VictorianTable implements Table {
  private final Logger logger = LoggerFactory.getLogger(VictorianTable.class);
  @Override
  public void info() {
    logger.info("Викторианский стол");
  }
}
