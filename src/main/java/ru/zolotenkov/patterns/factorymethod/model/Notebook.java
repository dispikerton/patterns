package ru.zolotenkov.patterns.factorymethod.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Notebook implements Product {
  private final Logger logger = LoggerFactory.getLogger(Notebook.class);
  @Override
  public void sayYourName() {
    logger.info("Ноутбук");
  }
}
