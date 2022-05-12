package ru.zolotenkov.patterns.composite;

public class App {
  public static void main(String[] args) {
    Container container = new Composite();
    container.add(new Component1());
    container.add(new Component2());

    Container container2 = new Composite();
    container2.add(new Component1());
    container2.add(new Component2());
    container.add(container2);

    container.execute();
  }
}
