package ru.zolotenkov.patterns.command;

import org.springframework.stereotype.Component;

@Component
public class SwitchOn implements Command {
  private final Light light;

  public SwitchOn(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOn();
  }
}
