package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.stereotype.Component;

@Component
public class OrderDao {
  void saveOrder(Order order){
    System.out.println("Заказ сохранен " + order);
  }
}
