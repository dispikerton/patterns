package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Component;

@Component
public class PackagingDepartment {
  public void festivelyPack(String productId, String orderId) {
    System.out.println("Празднично упаковываем продукт с id " + productId + " из заказа " + orderId);
  }
}
