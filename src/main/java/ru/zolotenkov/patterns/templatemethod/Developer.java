package ru.zolotenkov.patterns.templatemethod;

import org.springframework.stereotype.Service;

@Service
public class Developer extends AbstractEmployee {
  protected Developer(Dao dao) {
    super(dao);
  }

  @Override
  void specificWork(String info) {
    logger.info("{} помогает писать код", info);
  }
}
