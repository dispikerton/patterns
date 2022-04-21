package ru.zolotenkov.patterns.adapter.real2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RowingBoat implements Rowing{
  private final Logger logger = LoggerFactory.getLogger(RowingBoat.class);

  @Override
  public void row() {
    logger.info("Ебашим веслом");
  }
}
