package ru.zolotenkov.patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;

@Getter
public class Reader implements Observer {
  private final Logger logger = LoggerFactory.getLogger(Reader.class);
  private final String name;

  private final String wayToGet;

  public Reader(String name, String wayToGet) {
    this.name = name;
    this.wayToGet = wayToGet;
  }

  @Override
  public void observe() {
    String info = "Читатель " + name + " получил номер журнала " + wayToGet;
    logger.info(info);
  }
}
