package ru.zolotenkov.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
  User admin;
  List<User> users = new ArrayList<>();

  @Override
  public void setAdmin(User admin) {
    this.admin = admin;
  }

  @Override
  public void addUser(User user){
    users.add(user);
  }

  @Override
  public void sendMessage(String message, User user) {
    for (User u : users) {
      u.getMessage(message);
    }
    admin.getMessage(message);
  }
}
