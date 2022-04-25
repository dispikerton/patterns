package ru.zolotenkov.patterns.command;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final Switch switcher;

  public Controller(Switch switcher) {
    this.switcher = switcher;
  }

  @GetMapping
  public void executeCommand(@RequestParam String commandName) {
    switcher.execute(commandName);
  }
}
