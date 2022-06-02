package ru.zolotenkov.patterns.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    Human human = new Human("Иван", 18);
    Human copy = human.copy();

    logger.info("human {}", human);
    logger.info("human copy {}", copy);
  }
}
