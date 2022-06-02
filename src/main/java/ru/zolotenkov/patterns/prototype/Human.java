package ru.zolotenkov.patterns.prototype;


public class Human implements Copyable<Human> {
  private final String name;
  private final int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public Human copy() {
    return new Human(name, age);
  }
}
