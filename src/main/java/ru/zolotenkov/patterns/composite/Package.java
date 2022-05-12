package ru.zolotenkov.patterns.composite;

public interface Package extends Product {
  void add(Product product);
  void remove(Product product);
}
