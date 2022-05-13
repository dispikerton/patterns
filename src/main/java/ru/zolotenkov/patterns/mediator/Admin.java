package ru.zolotenkov.patterns.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Admin implements User {
  private final Logger logger = LoggerFactory.getLogger(Admin.class);
  private final Chat chat;

  public Admin(Chat chat) {
    this.chat = chat;
  }

  @Override
  public void sendMessage(String message) {
    chat.sendMessage(message, this);
  }

  @Override
  public void getMessage(String message) {
    logger.info("Админ получает сообщение: {}", message);
  }
}
