package ru.zolotenkov.patterns.factorymethod;

import ru.zolotenkov.patterns.factorymethod.creator.Creator;
import ru.zolotenkov.patterns.factorymethod.creator.NotebookCreator;
import ru.zolotenkov.patterns.factorymethod.creator.ProductCreator;
import ru.zolotenkov.patterns.factorymethod.creator.SmartphoneCreator;
import ru.zolotenkov.patterns.factorymethod.model.Product;
import ru.zolotenkov.patterns.factorymethod.model.ProductType;

public class Main {
  public static void main(String[] args) {
    Creator creator = new ProductCreator();
    Product product = creator.factoryMethod(ProductType.SMARTPHONE);
    product.sayYourName();

    Creator creator2 = new SmartphoneCreator();
    Product product2 = creator2.factoryMethod();
    product2.sayYourName();

    Creator creator3 = new NotebookCreator();
    Product product3 = creator3.factoryMethod();
    product3.sayYourName();
  }
}
