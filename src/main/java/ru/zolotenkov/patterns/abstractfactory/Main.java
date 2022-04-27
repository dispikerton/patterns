package ru.zolotenkov.patterns.abstractfactory;

import ru.zolotenkov.patterns.abstractfactory.factory.Factory;
import ru.zolotenkov.patterns.abstractfactory.factory.VictorianFurnitureFactory;
import ru.zolotenkov.patterns.abstractfactory.factory.VictorianMachine;
import ru.zolotenkov.patterns.abstractfactory.model.Furniture;

public class Main {
  public static void main(String[] args) {
    Factory factory = new VictorianFurnitureFactory(new VictorianMachine());
    Furniture chair = factory.createChair();
    chair.info();
    Furniture table = factory.createTable();
    table.info();
    Furniture armchair = factory.createArmchair();
    armchair.info();
  }
}

