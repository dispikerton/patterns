package ru.zolotenkov.patterns.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Component1 implements Component {
  private final Logger logger = LoggerFactory.getLogger(Component1.class);
  @Override
  public void execute() {
    logger.info("Компонент 1");
  }
}