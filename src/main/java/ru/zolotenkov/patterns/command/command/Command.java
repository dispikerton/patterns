package ru.zolotenkov.patterns.command.command;

import org.springframework.stereotype.Component;

import ru.zolotenkov.patterns.command.CommandInfo;

@Component
public interface Command {
  void execute(CommandInfo info);
}
