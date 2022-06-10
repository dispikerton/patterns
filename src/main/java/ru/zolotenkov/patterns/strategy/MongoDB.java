package ru.zolotenkov.patterns.strategy;

public class MongoDB implements Strategy {
  @Override
  public String getData() {
    return "Data from mongo";
  }
}
