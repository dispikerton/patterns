package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private final OrderDao orderDao;
  private final SmsNotificator smsNotificator;
  private final Insurance insurance;
  private final TestingDepartment testingDepartment;
  private final PackagingDepartment packagingDepartment;

  public OrderService(OrderDao orderDao, SmsNotificator smsNotificator, Insurance insurance, TestingDepartment testingDepartment,
                      PackagingDepartment packagingDepartment) {
    this.orderDao = orderDao;
    this.smsNotificator = smsNotificator;
    this.insurance = insurance;
    this.testingDepartment = testingDepartment;
    this.packagingDepartment = packagingDepartment;
  }

  boolean createOrder(Order order) {
    String orderId = order.getId();
    orderDao.saveOrder(order);
    if (order.isSmsNotification()) {
      smsNotificator.enableNotifications(orderId, order.getPhoneNumber());
    }

    for (Product product : order.getProducts()) {
      String productId = product.getId();
      if (product.isInsurance()) {
        insurance.insure(productId, orderId);
      }
      if (product.isTesting()) {
        testingDepartment.testProduct(productId, orderId);
      }
      if (product.isFestivePackaging()) {
        packagingDepartment.festivelyPack(productId, orderId);
      }
    }

    return true;
  }
}
