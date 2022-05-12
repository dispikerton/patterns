package ru.zolotenkov.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Container {

  private final List<Component> components = new ArrayList<>();

  @Override
  public void add(Component component) {
    components.add(component);
  }

  @Override
  public void remove(Component component) {
    components.remove(component);
  }

  @Override
  public void execute() {
    for (Component component : components) {
      component.execute();
    }
  }
}
