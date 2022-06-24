package ru.zolotenkov.patterns.templatemethod;

public class ProjectManager implements Employee {
  @Override
  public void work() {
    logger.info("Иду на созвон");
  }
}
