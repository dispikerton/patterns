package ru.zolotenkov.patterns.builder.model;

import java.util.List;

public class House {
  private final Basement basement;
  private final List<Wall> walls;
  private final Roof roof;
  private final Elevator elevator;

  public House(Basement basement, List<Wall> walls, Roof roof, Elevator elevator) {
    this.basement = basement;
    this.walls = walls;
    this.roof = roof;
    this.elevator = elevator;
  }

  @Override
  public String toString() {
    return "House{" +
      "basement=" + basement +
      ", walls=" + walls +
      ", roof=" + roof +
      ", elevator=" + elevator +
      '}';
  }
}
