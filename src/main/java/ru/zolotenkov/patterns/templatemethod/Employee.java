package ru.zolotenkov.patterns.templatemethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


interface Employee {
  Logger logger = LoggerFactory.getLogger(Employee.class);

  void specificWork();

  default void work() {
    checkMail();
    specificWork();
    turnOffComputer();
  }

  private void checkMail() {
    logger.info("Проверяю почту");
  }

  private void turnOffComputer() {
    logger.info("Выключаю компьютер");
  }
}
