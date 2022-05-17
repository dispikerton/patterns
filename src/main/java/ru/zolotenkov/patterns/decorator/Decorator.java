package ru.zolotenkov.patterns.decorator;

abstract class Decorator implements Developer {
  private final Developer developer;

  Decorator(Developer developer) {
    this.developer = developer;
  }

  @Override
  public void makeJob() {
    developer.makeJob();
  }
}
