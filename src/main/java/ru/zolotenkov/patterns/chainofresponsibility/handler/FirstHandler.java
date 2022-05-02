package ru.zolotenkov.patterns.chainofresponsibility.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class FirstHandler implements Handler {
  private final Logger logger = LoggerFactory.getLogger(FirstHandler.class);

  @Override
  public boolean execute() {
    logger.info("Первый обработчик");
    return false;
  }
}
