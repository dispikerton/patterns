package ru.zolotenkov.patterns.factorymethod.creator;

import ru.zolotenkov.patterns.factorymethod.model.Notebook;
import ru.zolotenkov.patterns.factorymethod.model.Product;
import ru.zolotenkov.patterns.factorymethod.model.ProductType;
import ru.zolotenkov.patterns.factorymethod.model.Smartphone;


public class Creator {
  public Product factoryMethod(ProductType productType) {
    switch (productType) {
    case SMARTPHONE:
      return new Smartphone();
    case NOTEBOOK:
      return new Notebook();
    default:
      throw new IllegalStateException("Unexpected value: " + productType);
    }
  }
}
