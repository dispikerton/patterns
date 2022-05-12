package ru.zolotenkov.patterns.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Component2 implements Component {
  private final Logger logger = LoggerFactory.getLogger(Component2.class);
  @Override
  public void execute() {
    logger.info("Компонент 2");
  }
}
