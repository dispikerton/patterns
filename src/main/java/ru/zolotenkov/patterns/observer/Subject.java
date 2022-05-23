package ru.zolotenkov.patterns.observer;

public interface Subject {
  void subscribe(Observer observer);
  void unSubscribe(Observer observer);
  void sendToAllSubscribers();
}
