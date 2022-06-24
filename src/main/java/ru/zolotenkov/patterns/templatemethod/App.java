package ru.zolotenkov.patterns.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    Employee projectManager = new ProjectManager();
    Employee developer = new Developer();
    projectManager.work();
    log.info("----------");
    developer.work();
  }
}
