package com.lysenko.pattenrsOOP.creational.prototype;

public class RacketFactory {
    private BadmintonRacket racket;

    public RacketFactory(BadmintonRacket racket) {
        this.racket = racket;
    }

    public void setRacket(BadmintonRacket racket) {
        this.racket = racket;
    }

    BadmintonRacket cloneRacket() {
        return (BadmintonRacket) racket.copy();
    }
}
