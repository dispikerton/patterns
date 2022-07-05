package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private final OrderDao orderDao;
  private final SmsNotificator smsNotificator;
  private final InsuranceService insuranceService;
  private final TestService testService;
  private final PackageService packageService;

  public OrderService(OrderDao orderDao,
                      SmsNotificator smsNotificator,
                      InsuranceService insuranceService,
                      TestService testService,
                      PackageService packageService) {
    this.orderDao = orderDao;
    this.smsNotificator = smsNotificator;
    this.insuranceService = insuranceService;
    this.testService = testService;
    this.packageService = packageService;
  }

  boolean createOrder(Order order) {
    orderDao.saveOrder(order);
    if (order.isSmsNotification()) {
      smsNotificator.enableNotifications(order.getId());
    }
    for (Product product : order.getProducts()) {
      if (product.isInsurance()) {
        insuranceService.insure(product.getId(), order.getId());
      }
      if (product.isTesting()) {
        testService.testProduct(product.getId(), order.getId());
      }
      if (product.isFestivePackaging()) {
        packageService.festivelyPack(product.getId(), order.getId());
      }
    }

    return true;
  }
}
