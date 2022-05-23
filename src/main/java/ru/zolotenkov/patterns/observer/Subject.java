package ru.zolotenkov.patterns.observer;

public interface Subject {
  void subscribe(Reader reader);
  void unSubscribe(Reader reader);
  void sendToAllSubscribers();
}
