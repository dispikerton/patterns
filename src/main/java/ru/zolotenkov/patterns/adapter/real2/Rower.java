package ru.zolotenkov.patterns.adapter.real2;

public class Rower {
  private final Rowing rowingBoat;

  public Rower(Rowing rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  void rowOnBoat(){
    rowingBoat.row();
  }

}
