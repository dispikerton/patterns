package ru.zolotenkov.patterns.builder;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.zolotenkov.patterns.builder.model.Basement;
import ru.zolotenkov.patterns.builder.model.Elevator;
import ru.zolotenkov.patterns.builder.model.House;
import ru.zolotenkov.patterns.builder.model.Roof;
import ru.zolotenkov.patterns.builder.model.Wall;

public class App {
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    House house = new HouseBuilder()
      .setBasement(new Basement())
      .setWalls(List.of(new Wall(), new Wall()))
      .setRoof(new Roof())
      .setElevator(new Elevator())
      .build();

    logger.info("{}", house);
  }
}
