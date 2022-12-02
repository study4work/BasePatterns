package com.lysenko.pattenrsOOP.structural.decorator;

public class AthletsDecorator implements Athlets {

    Athlets athlets;

    public AthletsDecorator(Athlets athlets) {
        this.athlets = athlets;
    }

    @Override
    public String run() {
        return athlets.run();
    }
}
