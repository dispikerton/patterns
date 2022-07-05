package ru.zolotenkov.patterns.chainofresponsibility.spring;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.zolotenkov.patterns.chainofresponsibility.spring.option.AdditionalOption;

@Service
public class OrderService {
  private final OrderDao orderDao;
  private final List<AdditionalOption> options;

  public OrderService(OrderDao orderDao, List<AdditionalOption> options) {
    this.orderDao = orderDao;
    this.options = options;
  }

  boolean createOrder(Order order) {
    orderDao.saveOrder(order);
    options.forEach(additionalOption -> additionalOption.apply(order));
    return true;
  }
}
