package ru.zolotenkov.patterns.factorymethod.creator;

import ru.zolotenkov.patterns.factorymethod.AnotherImplementationException;
import ru.zolotenkov.patterns.factorymethod.model.Product;
import ru.zolotenkov.patterns.factorymethod.model.ProductType;
import ru.zolotenkov.patterns.factorymethod.model.Smartphone;

public class SmartphoneCreator implements Creator {

  public Product factoryMethod() {
    return new Smartphone();
  }

  @Override
  public Product factoryMethod(ProductType productType) {
    throw new AnotherImplementationException("Другая реализация шаблона");
  }

}
