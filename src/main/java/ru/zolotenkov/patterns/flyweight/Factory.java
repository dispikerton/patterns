package ru.zolotenkov.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Factory {

  private final ProductDao productDao;

  private final Map<String, Product> productMap = new HashMap<>();

  public Product getProduct(String productName) {
    return productMap.computeIfAbsent(productName, productDao::getProduct);
  }
}
