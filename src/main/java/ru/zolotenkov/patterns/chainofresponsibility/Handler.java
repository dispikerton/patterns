package ru.zolotenkov.patterns.chainofresponsibility;

import org.springframework.stereotype.Component;

@Component
public interface Handler {
  boolean execute();
}
