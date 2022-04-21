package ru.zolotenkov.patterns.factorymethod.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.zolotenkov.patterns.factorymethod.creator.OS;

public class Notebook implements Product {
  private final Logger logger = LoggerFactory.getLogger(Notebook.class);

  private final OS os;

  public Notebook(OS os) {
    this.os = os;
  }

  @Override
  public void sayYourName() {
    String info = "Ноутбук c OS: " + os.name();
    logger.info(info);
  }
}
