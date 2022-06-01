package ru.zolotenkov.patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Development implements State {
  private final Logger logger = LoggerFactory.getLogger(Development.class);
  @Override
  public void toDo() {
    logger.info("Разработчик пишет код");
  }
}
