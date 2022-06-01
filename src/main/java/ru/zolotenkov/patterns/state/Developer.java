package ru.zolotenkov.patterns.state;

public class Developer {
  private State state;

  public Developer() {
    this.state = new Laze();
  }

  public void toDo() {
    state.toDo();
  }

  public void changeState(State state) {
    this.state = state;
  }

}
