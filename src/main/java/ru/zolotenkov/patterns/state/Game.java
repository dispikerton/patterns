package ru.zolotenkov.patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Game implements State {
  private final Logger logger = LoggerFactory.getLogger(Game.class);

  @Override
  public void toDo() {
    logger.info("Разработчик играет в CS 1.6");
  }
}
