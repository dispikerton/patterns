package ru.zolotenkov.patterns.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    Chat chat = new TextChat();
    User admin = new Admin(chat);
    User user1 = new SimpleUser(chat);
    User user2 = new SimpleUser(chat);

    chat.setAdmin(admin);
    chat.addUser(user1);
    chat.addUser(user2);

    user1.sendMessage("Привет, я пользователь");
    logger.info("-------------------");
    admin.sendMessage("Привет, я админ");
  }
}
