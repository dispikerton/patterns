package ru.zolotenkov.patterns.observer;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoOfMoscow implements Subject {

  private final Logger logger = LoggerFactory.getLogger(EchoOfMoscow.class);
  private final List<Observer> readers = new ArrayList<>();

  @Override
  public void subscribe(Reader reader) {
    String subscribeInfo = "Читатель " + reader.getName() + " подписался на Эхо Москвы";
    logger.info(subscribeInfo);
    readers.add(reader);
  }

  @Override
  public void unSubscribe(Reader reader) {
    String unSubscribeInfo = "Читатель " + reader.getName() + " отписался от Эхо Москвы";
    logger.info(unSubscribeInfo);
    readers.remove(reader);
  }

  public void sendToAllSubscribers() {
    readers.forEach(Observer::observe);
  }
}
