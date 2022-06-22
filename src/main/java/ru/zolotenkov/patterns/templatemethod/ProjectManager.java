package ru.zolotenkov.patterns.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProjectManager extends Employee {
  @Override
  public void work() {
    log.info("Иду на созвон");
  }
}
