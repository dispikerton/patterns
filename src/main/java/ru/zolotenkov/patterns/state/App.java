package ru.zolotenkov.patterns.state;

public class App {
  public static void main(String[] args) {
    Developer developer = new Developer();
    developer.toDo();
    developer.changeState(new Development());
    developer.toDo();
    developer.changeState(new Game());
    developer.toDo();
  }
}
