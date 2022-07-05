package ru.zolotenkov.patterns.chainofresponsibility.spring.option;

import org.springframework.stereotype.Component;

import ru.zolotenkov.patterns.chainofresponsibility.spring.Order;
import ru.zolotenkov.patterns.chainofresponsibility.spring.Product;
import ru.zolotenkov.patterns.chainofresponsibility.spring.TestingDepartment;

@Component
public class TestingOption implements AdditionalOption {
  private final TestingDepartment testingDepartment;

  public TestingOption(TestingDepartment testingDepartment) {
    this.testingDepartment = testingDepartment;
  }

  @Override
  public void apply(Order order) {
    order.getProducts()
      .stream()
      .filter(Product::isTesting)
      .forEach(product -> testingDepartment.testProduct(product.getId(), order.getId()));
  }
}
