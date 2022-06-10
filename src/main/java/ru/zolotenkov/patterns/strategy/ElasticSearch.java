package ru.zolotenkov.patterns.strategy;

public class ElasticSearch implements Strategy {
  @Override
  public String getData() {
    return "Data from elastic";
  }
}
