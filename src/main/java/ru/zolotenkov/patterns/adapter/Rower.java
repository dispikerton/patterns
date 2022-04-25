package ru.zolotenkov.patterns.adapter;

public class Rower {
  private final Rowing rowingBoat;

  public Rower(Rowing rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  void rowOnBoat(){
    rowingBoat.row();
  }

}
