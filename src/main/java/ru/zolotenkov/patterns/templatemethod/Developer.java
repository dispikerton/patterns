package ru.zolotenkov.patterns.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Developer implements Employee {
  @Override
  public void work() {
    log.info("Пишу код");
  }
}
