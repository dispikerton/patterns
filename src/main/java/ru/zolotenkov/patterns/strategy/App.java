package ru.zolotenkov.patterns.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    Context context = new Context(new MongoDB());
    log.info("data 1 {}", context.getData());
    context.setStrategy(new PostgreSQL());
    log.info("data 2 {}", context.getData());
    context.setStrategy(new ElasticSearch());
    log.info("data 3 {}", context.getData());
  }
}
