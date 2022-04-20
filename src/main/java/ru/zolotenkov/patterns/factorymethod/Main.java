package ru.zolotenkov.patterns.factorymethod;

import ru.zolotenkov.patterns.factorymethod.creator.Creator;
import ru.zolotenkov.patterns.factorymethod.model.Product;
import ru.zolotenkov.patterns.factorymethod.model.ProductType;

public class Main {
  public static void main(String[] args) {
    Creator creator = new Creator();
    Product product = creator.factoryMethod(ProductType.SMARTPHONE);
    product.sayYourName();
  }
}
