package ru.zolotenkov.patterns.adapter.real2;

public class FishingBoatAdapter extends RowingBoat {
  private final FishingBoat boat;

  public FishingBoatAdapter(FishingBoat boat) {
    this.boat = boat;
  }

  @Override
  void row() {
    boat.takeFish();
    System.out.println("а потом погреб");
  }
}
