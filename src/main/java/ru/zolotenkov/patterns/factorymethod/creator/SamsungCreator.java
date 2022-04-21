package ru.zolotenkov.patterns.factorymethod.creator;

import ru.zolotenkov.patterns.factorymethod.model.Notebook;
import ru.zolotenkov.patterns.factorymethod.model.Product;
import ru.zolotenkov.patterns.factorymethod.model.ProductType;
import ru.zolotenkov.patterns.factorymethod.model.Smartphone;

public class SamsungCreator implements Creator {

  @Override
  public Product factoryMethod(ProductType productType) {
    if (productType.equals(ProductType.NOTEBOOK)){
      return new Notebook(OS.WINDOWS);
    }else {
      return new Smartphone(OS.ANDROID);
    }
  }
}
