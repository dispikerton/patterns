package ru.zolotenkov.patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;

@Getter
public class Reader implements Observer {
  private final Logger logger = LoggerFactory.getLogger(Reader.class);
  private final String name;

  public Reader(String name) {
    this.name = name;
  }

  @Override
  public void observe() {
    String info = "Читатель " + name + " получил номер журнала";
    logger.info(info);
  }
}
