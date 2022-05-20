package ru.zolotenkov.patterns.memento;

import java.time.LocalDateTime;

import lombok.ToString;

@ToString
public class Request {
  private String status;
  private LocalDateTime createdAt;
  private String description;

  public Request(String status, String description) {
    this.status = status;
    this.createdAt = LocalDateTime.now();
    this.description = description;
  }

  public Memento createMemento() {
    return new Memento(status, createdAt, description);
  }

  public void restoreMemento(Request.Memento memento) {
    status = memento.status;
    createdAt = memento.createdAt;
    description = memento.description;
  }

  public void changeStatus(String status) {
    this.status = status;
  }

  static class Memento {
    private final String status;
    private final LocalDateTime createdAt;
    private final String description;

    Memento(String status, LocalDateTime createdAt, String description) {
      this.status = status;
      this.createdAt = createdAt;
      this.description = description;
    }
  }
}
