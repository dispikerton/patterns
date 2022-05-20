package ru.zolotenkov.patterns.facade;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facade")
public class FacadeController {
  private final DataFacade dataFacade;

  public FacadeController(DataFacade dataFacade) {
    this.dataFacade = dataFacade;
  }

  @GetMapping
  public List<String> collectData() {
    return dataFacade.collect();
  }
}
