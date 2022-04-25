package ru.zolotenkov.patterns.command;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Switch {
  private final Map<String, Command> commandMap;

  public Switch(Map<String, Command> commandMap) {
    this.commandMap = commandMap;
  }

  public void execute(String commandName) {
    Command command = commandMap.get(commandName);
    if (command == null) {
      throw new IllegalStateException("no command registered for " + commandName);
    }
    command.execute();
  }
}
