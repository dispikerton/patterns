package ru.zolotenkov.patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Bank {
  private final Logger logger = LoggerFactory.getLogger(Bank.class);

  public void deposit(String account, Long amount) {
    logger.info("На счёт {} поступило {} денег", account, amount);
  }

  public void withdraw(String account, Long amount) {
    logger.info("Со счёта {} списано {} денег", account, amount);
  }

  public void cancelTransaction(String transactionId) {
    logger.info("Откатываю транзакцию под номером {}", transactionId);
  }
}
