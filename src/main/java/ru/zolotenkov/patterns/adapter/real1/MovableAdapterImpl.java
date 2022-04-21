package ru.zolotenkov.patterns.adapter.real1;

public class MovableAdapterImpl implements Movable {

  private final Movable luxuryCars;

  public MovableAdapterImpl(Movable luxuryCars) {
    this.luxuryCars = luxuryCars;
  }

  @Override
  public double getSpeed() {
    return convertMPHtoKMPH(luxuryCars.getSpeed());
  }

  private double convertMPHtoKMPH(double mph) {
    return mph * 1.60934;
  }
}
