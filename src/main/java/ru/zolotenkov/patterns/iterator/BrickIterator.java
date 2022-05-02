package ru.zolotenkov.patterns.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class BrickIterator implements Iterator<Brick> {

    private final List<Brick> pileOfBricks;

    public BrickIterator(List<Brick> pileOfBricks) {
        this.pileOfBricks = pileOfBricks;
    }

    @Override
    public boolean hasNext() {
        return !pileOfBricks.isEmpty();
    }

    @Override
    public Brick next() {
        int randomBrick = new Random().nextInt(pileOfBricks.size());
        return pileOfBricks.remove(randomBrick);
    }
}
