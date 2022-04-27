package ru.zolotenkov.patterns.abstractfactory.factory;

import ru.zolotenkov.patterns.abstractfactory.model.Armchair;
import ru.zolotenkov.patterns.abstractfactory.model.Chair;
import ru.zolotenkov.patterns.abstractfactory.model.Table;

public interface Factory {
  Chair createChair();
  Table createTable();
  Armchair createArmchair();
}
