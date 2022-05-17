package ru.zolotenkov.patterns.decorator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaDeveloper implements Developer {

  private final Logger logger = LoggerFactory.getLogger(JavaDeveloper.class);

  @Override
  public void makeJob() {
    logger.info("Пишу java код");
  }
}
