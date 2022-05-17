package ru.zolotenkov.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiddleJavaDeveloper extends Decorator {

  private final Logger logger = LoggerFactory.getLogger(MiddleJavaDeveloper.class);

  MiddleJavaDeveloper(Developer developer) {
    super(developer);
  }

  @Override
  public void makeJob() {
    logger.info("Применяю паттерны");
    super.makeJob();
  }
}
