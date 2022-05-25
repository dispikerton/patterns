package ru.zolotenkov.patterns.flyweight;

import org.springframework.stereotype.Service;

@Service
public class ProductDao {

  public Product getProduct(String productName) {
    return new Product(productName);
  }
}
