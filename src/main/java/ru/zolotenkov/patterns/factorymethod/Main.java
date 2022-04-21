package ru.zolotenkov.patterns.factorymethod;

import ru.zolotenkov.patterns.factorymethod.creator.Creator;
import ru.zolotenkov.patterns.factorymethod.creator.SamsungCreator;
import ru.zolotenkov.patterns.factorymethod.creator.AppleCreator;
import ru.zolotenkov.patterns.factorymethod.model.Product;
import ru.zolotenkov.patterns.factorymethod.model.ProductType;

public class Main {
  public static void main(String[] args) {

    Creator appleCreator = new AppleCreator();
    Product appleSmartphone = appleCreator.factoryMethod(ProductType.SMARTPHONE);
    appleSmartphone.sayYourName();

    Creator samsungCreator = new SamsungCreator();
    Product samsungNoteBook = samsungCreator.factoryMethod(ProductType.NOTEBOOK);
    samsungNoteBook.sayYourName();
  }
}
