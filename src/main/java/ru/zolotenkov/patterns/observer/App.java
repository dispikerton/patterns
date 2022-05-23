package ru.zolotenkov.patterns.observer;

public class App {
  public static void main(String[] args) {
    Subject echoOfMoscow = new EchoOfMoscow();
    Reader ivan = new Reader("Иван");
    Reader nikolai = new Reader("Николай");

    echoOfMoscow.subscribe(ivan);
    echoOfMoscow.subscribe(nikolai);
    echoOfMoscow.sendToAllSubscribers();
    echoOfMoscow.unSubscribe(ivan);
  }
}
