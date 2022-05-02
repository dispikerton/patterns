package ru.zolotenkov.patterns.iterator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Bricklayer bricklayer = new Bricklayer();
        List<Brick> pileOfBricks = new ArrayList<>(Arrays.asList(new Brick(), new Brick()));
        Iterator<Brick> iterator = new BrickIterator(pileOfBricks);
        while (iterator.hasNext()) {
            Brick nextBrick = iterator.next();
            bricklayer.lay(nextBrick);
        }
    }
}
