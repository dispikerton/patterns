package ru.zolotenkov.patterns.templatemethod;

public class ProjectManager implements Employee {
  @Override
  public void specificWork() {
    logger.info("Иду на созвон");
  }
}
