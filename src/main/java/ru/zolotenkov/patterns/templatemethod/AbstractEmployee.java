package ru.zolotenkov.patterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractEmployee {
  Logger logger = LoggerFactory.getLogger(AbstractEmployee.class);

  private final Dao dao;

  protected AbstractEmployee(Dao dao) {
    this.dao = dao;
  }

  public void work() {
    String info = dao.getInfo();
    specificWork(info);
  }

  abstract void specificWork(String info);
}
