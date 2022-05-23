package ru.zolotenkov.patterns.observer;

public class App {
  public static void main(String[] args) {
    Subject echoOfMoscow = new EchoOfMoscow();
    Reader ivan = new Reader("Иван", "по почте");
    Reader nikolai = new Reader("Николай", "самовывозом");
    Reader svetlana = new Reader("Светлана", "курьером");

    echoOfMoscow.subscribe(ivan);
    echoOfMoscow.subscribe(nikolai);
    echoOfMoscow.subscribe(svetlana);
    echoOfMoscow.sendToAllSubscribers();
    echoOfMoscow.unSubscribe(ivan);
  }
}
