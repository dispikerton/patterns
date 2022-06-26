package ru.zolotenkov.patterns.templatemethod;

import org.springframework.stereotype.Service;

@Service
public class Tester extends AbstractEmployee {
  protected Tester(Dao dao) {
    super(dao);
  }

  @Override
  void specificWork(String info) {
    logger.info("{} помогает тестировать систему", info);
  }
}
