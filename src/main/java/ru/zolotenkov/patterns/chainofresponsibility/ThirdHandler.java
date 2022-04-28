package ru.zolotenkov.patterns.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ThirdHandler implements Handler {
  private final Logger logger = LoggerFactory.getLogger(ThirdHandler.class);
  @Override
  public boolean execute() {
    logger.info("Третий обработчик");
    return false;
  }
}
