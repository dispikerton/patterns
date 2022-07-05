package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificator {
  void enableNotifications(String orderId) {
    System.out.println("Включены смс уведомления для заказа номер " + orderId);
  }
}
