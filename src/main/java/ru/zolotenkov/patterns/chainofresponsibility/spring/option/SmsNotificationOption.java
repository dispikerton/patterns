package ru.zolotenkov.patterns.chainofresponsibility.spring.option;

import org.springframework.stereotype.Component;

import ru.zolotenkov.patterns.chainofresponsibility.spring.Order;
import ru.zolotenkov.patterns.chainofresponsibility.spring.SmsNotificator;

@Component
public class SmsNotificationOption implements AdditionalOption {
  private final SmsNotificator smsNotificator;

  public SmsNotificationOption(SmsNotificator smsNotificator) {
    this.smsNotificator = smsNotificator;
  }

  @Override
  public void apply(Order order) {
    if (order.isSmsNotification()) {
      smsNotificator.enableNotifications(order.getId(), order.getPhoneNumber());
    }
  }
}
