package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Component;

@Component
public class Insurance {
  public void insure(String productId, String orderId) {
    System.out.println("Страхуем продукт с id " + productId + " из заказа " + orderId);
  }
}
