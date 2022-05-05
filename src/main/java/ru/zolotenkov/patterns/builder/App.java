package ru.zolotenkov.patterns.builder;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.java.Log;
import ru.zolotenkov.patterns.builder.model.Basement;
import ru.zolotenkov.patterns.builder.model.Elevator;
import ru.zolotenkov.patterns.builder.model.House;
import ru.zolotenkov.patterns.builder.model.Roof;
import ru.zolotenkov.patterns.builder.model.Wall;

@Log
public class App {
  public static void main(String[] args) {
    House house = House.builder()
      .basement(new Basement())
      .elevator(new Elevator())
      .roof(new Roof())
      .walls(List.of(new Wall()))
      .build();

    log.info(house.toString());
  }
}
