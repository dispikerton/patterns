package ru.zolotenkov.patterns.chainofresponsibility.spring;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MDoradoController {
  private final OrderService orderService;

  public MDoradoController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping
  public boolean createOrder(@RequestBody Order order){
    return orderService.createOrder(order);
  }
}
