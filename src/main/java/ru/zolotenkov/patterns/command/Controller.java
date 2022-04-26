package ru.zolotenkov.patterns.command;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final InvokerService invokerService;

  public Controller(InvokerService invokerService) {
    this.invokerService = invokerService;
  }

  @GetMapping
  public void executeCommand(@RequestBody CommandInfo info) {
    invokerService.execute(info);
  }
}
