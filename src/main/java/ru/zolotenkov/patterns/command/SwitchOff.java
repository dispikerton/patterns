package ru.zolotenkov.patterns.command;

import org.springframework.stereotype.Component;

@Component
public class SwitchOff implements Command {
  private final Light light;

  public SwitchOff(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOff();
  }
}
