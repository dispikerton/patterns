package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificator {
  public void enableNotifications(String orderId, String phoneNumber) {
    System.out.println("Включены смс уведомления для заказа номер " + orderId + " по телефону " + phoneNumber);
  }
}
