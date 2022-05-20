package ru.zolotenkov.patterns.abstractfactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.zolotenkov.patterns.abstractfactory.factory.Factory;
import ru.zolotenkov.patterns.abstractfactory.model.Armchair;
import ru.zolotenkov.patterns.abstractfactory.model.Chair;
import ru.zolotenkov.patterns.abstractfactory.model.Table;

@RestController
@RequestMapping("/factory")
public class FactoryController {
  private final Factory factory;

  public FactoryController(Factory factory) {
    this.factory = factory;
  }

  @GetMapping("/factory/create")
  public void createFurniture() {
    Armchair armchair = factory.createArmchair();
    Chair chair = factory.createChair();
    Table table = factory.createTable();
    armchair.info();
    chair.info();
    table.info();
  }
}
