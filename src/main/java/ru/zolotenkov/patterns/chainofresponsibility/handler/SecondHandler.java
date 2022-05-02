package ru.zolotenkov.patterns.chainofresponsibility.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SecondHandler implements Handler {
  private final Logger logger = LoggerFactory.getLogger(SecondHandler.class);

  @Override
  public boolean execute() {
    logger.info("Второй обработчик");
    return false;
  }
}