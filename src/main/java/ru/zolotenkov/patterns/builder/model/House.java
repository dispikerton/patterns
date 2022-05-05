package ru.zolotenkov.patterns.builder.model;

import java.util.List;

import lombok.Builder;

@Builder
public class House {
  private final Basement basement;
  private final List<Wall> walls;
  private final Roof roof;
  private final Elevator elevator;

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
