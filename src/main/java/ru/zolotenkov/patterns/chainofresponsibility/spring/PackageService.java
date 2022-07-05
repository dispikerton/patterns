package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Component;

@Component
public class PackageService {
  public void festivelyPack(String productId, String orderId) {
    System.out.println("Празднично упаковываем продукт c id " + productId + " из заказа " + orderId);
  }
}
