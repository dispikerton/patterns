package ru.zolotenkov.patterns.builder;

import java.util.List;

import ru.zolotenkov.patterns.builder.model.Basement;
import ru.zolotenkov.patterns.builder.model.Elevator;
import ru.zolotenkov.patterns.builder.model.House;
import ru.zolotenkov.patterns.builder.model.Roof;
import ru.zolotenkov.patterns.builder.model.Wall;

public class HouseBuilder {
  private Basement basement;
  private List<Wall> walls;
  private Roof roof;
  private Elevator elevator;

  public HouseBuilder setBasement(Basement basement) {
    this.basement = basement;
    return this;
  }

  public HouseBuilder setWalls(List<Wall> walls) {
    this.walls = walls;
    return this;
  }

  public HouseBuilder setRoof(Roof roof) {
    this.roof = roof;
    return this;
  }

  public HouseBuilder setElevator(Elevator elevator) {
    this.elevator = elevator;
    return this;
  }

  public House build(){
    return new House(basement, walls, roof, elevator);
  }
}
