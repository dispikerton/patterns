package ru.zolotenkov.patterns.adapter.real2;

public class Main {
  public static void main(String[] args) {
    FishingBoat fishingBoat = new FishingBoat();
    FishingBoatAdapter adapter = new FishingBoatAdapter(fishingBoat);
    Rower rower = new Rower(adapter);
    rower.rowOnBoat();
  }
}
