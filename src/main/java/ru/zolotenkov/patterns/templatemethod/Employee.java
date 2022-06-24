package ru.zolotenkov.patterns.templatemethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Employee {
  private final Logger logger = LoggerFactory.getLogger(Employee.class);
  abstract void work();

  public void doJob() {
    checkMail();
    work();
  }

  public void checkMail(){
    logger.info("Проверяю почту");
  }
}
