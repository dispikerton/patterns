package ru.zolotenkov.patterns.observer;

public class App {
  public static void main(String[] args) {
    Subject echoOfMoscow = new EchoOfMoscow();
    Observer ivan = new Reader("Иван", "по почте");
    Observer nikolai = new Reader("Николай", "самовывозом");
    Observer svetlana = new Reader("Светлана", "курьером");

    echoOfMoscow.subscribe(ivan);
    echoOfMoscow.subscribe(nikolai);
    echoOfMoscow.subscribe(svetlana);
    echoOfMoscow.sendToAllSubscribers();
  }
}
