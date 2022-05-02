package ru.zolotenkov.patterns.adapter;

import ru.zolotenkov.patterns.adapter.model.FishingBoat;
import ru.zolotenkov.patterns.adapter.model.FishingBoatAdapter;
import ru.zolotenkov.patterns.adapter.model.Rower;

public class Main {
  public static void main(String[] args) {
    FishingBoat fishingBoat = new FishingBoat();
    FishingBoatAdapter adapter = new FishingBoatAdapter(fishingBoat);
    Rower rower = new Rower(adapter);
    rower.rowOnBoat();
  }
}
