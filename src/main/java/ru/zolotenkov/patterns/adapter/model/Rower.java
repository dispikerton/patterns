package ru.zolotenkov.patterns.adapter.model;

public class Rower {
  private final Rowing rowingBoat;

  public Rower(Rowing rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  public void rowOnBoat(){
    rowingBoat.row();
  }

}
