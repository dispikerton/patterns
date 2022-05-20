package ru.zolotenkov.patterns.command;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/command")
public class CommandController {

  private final InvokerService invokerService;

  public CommandController(InvokerService invokerService) {
    this.invokerService = invokerService;
  }

  @GetMapping
  public void executeCommand(@RequestBody CommandInfo info) {
    invokerService.executeCommand(info);
  }
}
