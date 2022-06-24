package ru.zolotenkov.patterns.templatemethod;

public class Developer implements Employee {
  @Override
  public void work() {
    logger.info("Пишу код");
  }
}
