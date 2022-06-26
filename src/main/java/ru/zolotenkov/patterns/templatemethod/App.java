package ru.zolotenkov.patterns.templatemethod;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class App {

  private final AbstractEmployee abstractEmployee;

  public App(@Qualifier("developer") AbstractEmployee abstractEmployee) {
    this.abstractEmployee = abstractEmployee;
  }

  @GetMapping
  public void test() {
    abstractEmployee.work();
  }
}
