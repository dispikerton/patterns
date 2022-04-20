package ru.zolotenkov.patterns.factorymethod.creator;

import ru.zolotenkov.patterns.factorymethod.model.Product;
import ru.zolotenkov.patterns.factorymethod.model.ProductType;


public interface Creator {
  Product factoryMethod();

  Product factoryMethod(ProductType productType);
}
