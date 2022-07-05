package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Component;

@Component
public class InsuranceService {
  public void insure(String productId, String orderId) {
    System.out.println("Страхуем продукт c id " + productId + " из заказа " + orderId);
  }
}
