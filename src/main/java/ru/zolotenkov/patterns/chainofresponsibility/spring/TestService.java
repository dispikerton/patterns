package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Component;

@Component
public class TestService {
  public void testProduct(String productId, String orderId) {
    System.out.println("Тестируем продукт c id " + productId + " из заказа " + orderId);
  }
}
