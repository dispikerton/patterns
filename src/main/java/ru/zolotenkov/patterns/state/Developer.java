package ru.zolotenkov.patterns.state;

public class Developer {
  private State state;

  public Developer(State state) {
    this.state = state;
  }

  public void toDo() {
    state.toDo();
  }

  public void changeState(State state) {
    this.state = state;
  }

}
