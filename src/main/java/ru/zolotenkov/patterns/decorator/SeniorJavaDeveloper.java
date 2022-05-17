package ru.zolotenkov.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeniorJavaDeveloper extends Decorator {

  private final Logger logger = LoggerFactory.getLogger(SeniorJavaDeveloper.class);

  SeniorJavaDeveloper(Developer developer) {
    super(developer);
  }

  @Override
  public void makeJob() {
    logger.info("Пишу тесты");
    super.makeJob();
  }
}
