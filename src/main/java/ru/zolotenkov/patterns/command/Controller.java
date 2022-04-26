package ru.zolotenkov.patterns.command;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final Invoker invoker;

  public Controller(Invoker invoker) {
    this.invoker = invoker;
  }

  @GetMapping
  public void executeCommand(@RequestParam String commandName,
                             @RequestParam String account,
                             @RequestParam Long amount) {
    invoker.execute(commandName, account, amount);
  }
}
