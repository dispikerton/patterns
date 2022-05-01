package ru.zolotenkov.patterns.bridge.model;

public abstract class Tractor {
    private Trailer trailer;

    public Tractor() {
    }

    public Tractor(Trailer trailer) {
        this.trailer = trailer;
    }

    public abstract void move();

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
}
