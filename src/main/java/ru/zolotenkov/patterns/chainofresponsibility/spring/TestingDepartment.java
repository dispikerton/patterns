package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Component;

@Component
public class TestingDepartment {
  public void testProduct(String productId, String orderId) {
    System.out.println("Тестируем продукт с id " + productId + " из заказа " + orderId);
  }
}
