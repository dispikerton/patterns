package ru.zolotenkov.patterns.strategy;

public class PostgreSQL implements Strategy {

  @Override
  public String getData() {
    return "Data from postgres";
  }
}
