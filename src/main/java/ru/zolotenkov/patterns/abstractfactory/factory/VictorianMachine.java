package ru.zolotenkov.patterns.abstractfactory.factory;

import org.springframework.stereotype.Component;

import ru.zolotenkov.patterns.abstractfactory.model.Armchair;
import ru.zolotenkov.patterns.abstractfactory.model.Chair;
import ru.zolotenkov.patterns.abstractfactory.model.Table;
import ru.zolotenkov.patterns.abstractfactory.model.VictorianArmchair;
import ru.zolotenkov.patterns.abstractfactory.model.VictorianChair;
import ru.zolotenkov.patterns.abstractfactory.model.VictorianTable;

@Component
public class VictorianMachine {

  public Chair createChair() {
    return new VictorianChair();
  }

  public Table createTable() {
    return new VictorianTable();
  }

  public Armchair createArmchair() {
    return new VictorianArmchair();
  }
}
