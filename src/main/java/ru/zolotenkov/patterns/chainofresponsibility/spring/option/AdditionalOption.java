package ru.zolotenkov.patterns.chainofresponsibility.spring.option;

import ru.zolotenkov.patterns.chainofresponsibility.spring.Order;

public interface AdditionalOption {
  void apply(Order order);
}
