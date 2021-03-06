package ru.zolotenkov.patterns.command;

import java.util.Map;

import org.springframework.stereotype.Service;

import ru.zolotenkov.patterns.command.command.Command;

@Service
public class InvokerService {
  private final Map<String, Command> commandMap;

  public InvokerService(Map<String, Command> commandMap) {
    this.commandMap = commandMap;
  }

  public void executeCommand(CommandInfo info) {
    String commandName = info.getCommandName();
    Command command = commandMap.get(commandName);
    if (command == null) {
      throw new IllegalStateException("no command registered for " + commandName);
    }
    command.execute(info);
  }
}
