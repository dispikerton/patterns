package ru.zolotenkov.patterns.chainofresponsibility;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.zolotenkov.patterns.chainofresponsibility.handler.Handler;

@RestController("/chain")
public class ChainController {
  private final List<Handler> handlers;

  public ChainController(List<Handler> handlers) {
    this.handlers = handlers;
  }

  @GetMapping("/chain/execute")
  public void execute() {
    for (Handler handler: handlers) {
      boolean isInterrupted = handler.execute();
      if (isInterrupted) break;
    }
  }
}
