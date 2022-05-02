package ru.zolotenkov.patterns.chainofresponsibility.handler;

import org.springframework.stereotype.Component;

@Component
public interface Handler {
  boolean execute();
}
