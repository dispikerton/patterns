package ru.zolotenkov.patterns.adapter.real2;

public class Rower {
  private final RowingBoat rowingBoat;

  public Rower(RowingBoat rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  void rowOnBoat(){
    rowingBoat.row();
  }

}
