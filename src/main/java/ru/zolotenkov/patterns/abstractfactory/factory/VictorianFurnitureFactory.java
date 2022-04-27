package ru.zolotenkov.patterns.abstractfactory.factory;

import org.springframework.stereotype.Component;

import ru.zolotenkov.patterns.abstractfactory.model.Armchair;
import ru.zolotenkov.patterns.abstractfactory.model.Chair;
import ru.zolotenkov.patterns.abstractfactory.model.Table;

@Component
public class VictorianFurnitureFactory implements Factory {

  private final VictorianMachine victorianMachine;

  public VictorianFurnitureFactory(VictorianMachine victorianMachine) {
    this.victorianMachine = victorianMachine;
  }

  @Override
  public Chair createChair() {
    return victorianMachine.createChair();
  }

  @Override
  public Table createTable() {
    return victorianMachine.createTable();
  }

  @Override
  public Armchair createArmchair() {
    return victorianMachine.createArmchair();
  }
}
