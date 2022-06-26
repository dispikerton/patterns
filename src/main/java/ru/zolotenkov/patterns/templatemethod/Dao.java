package ru.zolotenkov.patterns.templatemethod;

import org.springframework.stereotype.Service;

@Service
public class Dao {
  private static final String INFO = "Информация";

  public String getInfo() {
    return INFO;
  }
}
