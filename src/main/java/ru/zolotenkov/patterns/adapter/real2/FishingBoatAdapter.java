package ru.zolotenkov.patterns.adapter.real2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingBoatAdapter implements Rowing {

  private final Logger logger = LoggerFactory.getLogger(FishingBoatAdapter.class);
  private final FishingBoat boat;

  public FishingBoatAdapter(FishingBoat boat) {
    this.boat = boat;
  }

  @Override
  public void row() {
    boat.takeFish();
    logger.info("а потом погреб");
  }
}
