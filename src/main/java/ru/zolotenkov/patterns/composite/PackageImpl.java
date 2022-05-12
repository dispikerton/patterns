package ru.zolotenkov.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class PackageImpl implements Package {

  private final List<Product> products = new ArrayList<>();

  @Override
  public void add(Product product) {
    products.add(product);
  }

  @Override
  public void remove(Product product) {
    products.remove(product);
  }

  @Override
  public int getPrice() {
    return products.stream()
      .mapToInt(Product::getPrice)
      .sum();
  }
}
