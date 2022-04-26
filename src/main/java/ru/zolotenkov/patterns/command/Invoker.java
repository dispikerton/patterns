package ru.zolotenkov.patterns.command;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Invoker {
  private final Map<String, Command> commandMap;

  public Invoker(Map<String, Command> commandMap) {
    this.commandMap = commandMap;
  }

  public void execute(String commandName, String account, Long amount) {
    Command command = commandMap.get(commandName);
    if (command == null) {
      throw new IllegalStateException("no command registered for " + commandName);
    }
    command.execute(account, amount);
  }
}
