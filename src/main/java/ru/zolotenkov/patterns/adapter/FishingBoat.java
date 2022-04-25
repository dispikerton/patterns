package ru.zolotenkov.patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingBoat implements Fishing{
  private final Logger logger = LoggerFactory.getLogger(FishingBoat.class);

  @Override
  public void takeFish() {
    logger.info("Рыбку ловлю");
  }
}
