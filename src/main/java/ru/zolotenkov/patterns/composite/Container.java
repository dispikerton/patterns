package ru.zolotenkov.patterns.composite;

public interface Container extends Component {
  void add(Component component);

  void remove(Component component);
}
