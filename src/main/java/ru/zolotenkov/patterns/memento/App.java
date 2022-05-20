package ru.zolotenkov.patterns.memento;

public class App {

  public static void main(String[] args) {
    Request request = new Request("NEW", "Поменять номера автомобиля");
    MementoDao mementoDao = new MementoDao();
    mementoDao.save(request.createMemento());
    request.changeStatus("IN WORK");
    request.restoreMemento(mementoDao.load());
  }
}
