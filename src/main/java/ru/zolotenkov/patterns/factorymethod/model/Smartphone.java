package ru.zolotenkov.patterns.factorymethod.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.zolotenkov.patterns.factorymethod.creator.OS;

public class Smartphone implements Product {
  private final Logger logger = LoggerFactory.getLogger(Smartphone.class);
  private final OS os;

  public Smartphone(OS os) {
     this.os = os;
  }

  @Override
  public void sayYourName() {
    String info = "Смартфон c OS: " + os.name();
    logger.info(info);
  }
}
