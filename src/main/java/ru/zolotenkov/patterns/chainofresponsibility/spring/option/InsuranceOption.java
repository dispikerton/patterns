package ru.zolotenkov.patterns.chainofresponsibility.spring.option;

import org.springframework.stereotype.Component;

import ru.zolotenkov.patterns.chainofresponsibility.spring.Insurance;
import ru.zolotenkov.patterns.chainofresponsibility.spring.Order;
import ru.zolotenkov.patterns.chainofresponsibility.spring.Product;

@Component
public class InsuranceOption implements AdditionalOption {
  private final Insurance insurance;

  public InsuranceOption(Insurance insurance) {
    this.insurance = insurance;
  }

  @Override
  public void apply(Order order) {
    order.getProducts()
      .stream()
      .filter(Product::isInsurance)
      .forEach(product -> insurance.insure(product.getId(), order.getId()));
  }
}
