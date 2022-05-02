package ru.zolotenkov.patterns.iterator;

public interface AbstractIterator {

    boolean hasNext();

    Brick getNext();
}
