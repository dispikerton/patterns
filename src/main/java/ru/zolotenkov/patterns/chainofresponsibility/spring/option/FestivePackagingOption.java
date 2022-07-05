package ru.zolotenkov.patterns.chainofresponsibility.spring.option;

import org.springframework.stereotype.Component;

import ru.zolotenkov.patterns.chainofresponsibility.spring.Order;
import ru.zolotenkov.patterns.chainofresponsibility.spring.PackagingDepartment;
import ru.zolotenkov.patterns.chainofresponsibility.spring.Product;

@Component
public class FestivePackagingOption implements AdditionalOption {
  private final PackagingDepartment packagingDepartment;

  public FestivePackagingOption(PackagingDepartment packagingDepartment) {
    this.packagingDepartment = packagingDepartment;
  }

  @Override
  public void apply(Order order) {
    order.getProducts()
      .stream()
      .filter(Product::isFestivePackaging)
      .forEach(product -> packagingDepartment.festivelyPack(product.getId(), order.getId()));
  }
}
