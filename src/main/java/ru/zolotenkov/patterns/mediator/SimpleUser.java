package ru.zolotenkov.patterns.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleUser implements User {
  private final Logger logger = LoggerFactory.getLogger(SimpleUser.class);
  private final Chat chat;

  public SimpleUser(Chat chat) {
    this.chat = chat;
  }

  @Override
  public void sendMessage(String message) {
    chat.sendMessage(message, this);
  }

  @Override
  public void getMessage(String message) {
    logger.info("Пользователь получает сообщение: {}", message);
  }
}
