package com.lysenko.pattenrsOOP.structural.decorator;

public class LongDistanceRunner extends AthletsDecorator {
    public LongDistanceRunner(Athlets athlets) {
        super(athlets);
    }

    public String longDistanceRun() {
        return "taking estafet from 200 to 400";
    }

    @Override
    public String run() {
        return super.run() + longDistanceRun();
    }
}
