package ru.zolotenkov.patterns.adapter.real1;

public class Main {
  public static void main(String[] args) {
    Movable bugattiVeyron = new BugattiVeyron();
    System.out.println(bugattiVeyron.getSpeed());

    Movable movableAdapter = new MovableAdapterImpl(bugattiVeyron);
    System.out.println(movableAdapter.getSpeed());
  }
}
