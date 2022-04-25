package ru.zolotenkov.patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Light {
  private final Logger logger = LoggerFactory.getLogger(Light.class);

  public void turnOn() {
    logger.info("Свет включен");
  }

  public void turnOff() {
    logger.info("Свет выключен");
  }
}
