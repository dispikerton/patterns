package ru.zolotenkov.patterns.strategy;

import lombok.Setter;

@Setter
public class Context {
  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public String getData() {
    return strategy.getData();
  }
}
