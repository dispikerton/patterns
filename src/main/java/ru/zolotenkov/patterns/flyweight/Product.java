package ru.zolotenkov.patterns.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;

@Getter
public class Product {
  private static final Logger logger = LoggerFactory.getLogger(Product.class);
  private final String name;

  public Product(String productName) {
    this.name = productName;
  }

  public void sayMyName() {
    logger.info(name);
  }
}
