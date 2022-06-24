package ru.zolotenkov.patterns.templatemethod;

public class Developer implements Employee {
  @Override
  public void specificWork() {
    logger.info("Пишу код");
  }
}
