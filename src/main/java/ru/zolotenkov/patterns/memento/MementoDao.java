package ru.zolotenkov.patterns.memento;

public class MementoDao {
  private Request.Memento memento;

  public void save(Request.Memento memento) {
    this.memento = memento;
  }

  public Request.Memento load() {
    return memento;
  }
}
