package ru.zolotenkov.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EchoOfMoscow implements Subject {
  private final List<Observer> readers = new ArrayList<>();

  @Override
  public void subscribe(Observer reader) {
    readers.add(reader);
  }

  @Override
  public void unSubscribe(Observer reader) {
    readers.remove(reader);
  }

  public void sendToAllSubscribers() {
    readers.forEach(Observer::observe);
  }
}
