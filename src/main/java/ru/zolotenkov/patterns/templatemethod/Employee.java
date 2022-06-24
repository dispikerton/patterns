package ru.zolotenkov.patterns.templatemethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


interface Employee {
    Logger logger = LoggerFactory.getLogger(Employee.class);
   void work();

   default void doJob() {
    checkMail();
    work();
  }

  private void checkMail(){
    logger.info("Проверяю почту");
  }
}
