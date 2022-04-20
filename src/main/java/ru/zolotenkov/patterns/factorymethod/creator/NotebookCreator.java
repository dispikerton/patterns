package ru.zolotenkov.patterns.factorymethod.creator;

import ru.zolotenkov.patterns.factorymethod.AnotherImplementationException;
import ru.zolotenkov.patterns.factorymethod.model.Notebook;
import ru.zolotenkov.patterns.factorymethod.model.Product;
import ru.zolotenkov.patterns.factorymethod.model.ProductType;

public class NotebookCreator implements Creator {
  @Override
  public Product factoryMethod() {
    return new Notebook();
  }

  @Override
  public Product factoryMethod(ProductType productType) {
    throw new AnotherImplementationException("Другая реализация шаблона");
  }
}
