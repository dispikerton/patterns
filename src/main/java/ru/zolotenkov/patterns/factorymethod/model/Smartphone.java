package ru.zolotenkov.patterns.factorymethod.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Smartphone implements Product {
  private final Logger logger = LoggerFactory.getLogger(Smartphone.class);
  @Override
  public void sayYourName() {
    logger.info("Смартфон");
  }
}
