package ru.zolotenkov.patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Laze implements State {
  private final Logger logger = LoggerFactory.getLogger(Laze.class);
  @Override
  public void toDo() {
    logger.info("Разработчик лежит на диване");
  }
}
