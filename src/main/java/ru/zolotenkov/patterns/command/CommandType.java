package ru.zolotenkov.patterns.command;

public enum CommandType {
  SWITCH_ON("switchOn"), SWITCH_OFF("switchOff");

  private final String name;

  CommandType(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
