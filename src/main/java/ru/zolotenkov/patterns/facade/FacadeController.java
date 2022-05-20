package ru.zolotenkov.patterns.facade;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/facade")
public class FacadeController {
  private final DataFacade dataFacade;

  public FacadeController(DataFacade dataFacade) {
    this.dataFacade = dataFacade;
  }

  @GetMapping("/collect")
  public List<String> executeFacade() {
    return dataFacade.collect();
  }
}
