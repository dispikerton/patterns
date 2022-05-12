package ru.zolotenkov.patterns.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    Package package1 = new PackageImpl();
    package1.add(new Sugar());
    package1.add(new Sugar());

    Package package2 = new PackageImpl();
    package2.add(new Bread());
    package2.add(new Bread());

    package1.add(package2);
    int price = package1.getPrice();
    logger.info("price {}", price);
  }
}
