package ru.zolotenkov.patterns.mediator;

public interface Chat {
  void setAdmin(User admin);

  void addUser(User user);

  void sendMessage(String message, User user);
}
