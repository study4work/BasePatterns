package com.lysenko.pattenrsOOP.structural.decorator;

public class SprintRunner extends AthletsDecorator {
    public SprintRunner(Athlets athlets) {
        super(athlets);
    }

    public String takingEstafet() {
        return "taiking estafet from 100 to 200";
    }

    @Override
    public String run() {
        return super.run() + takingEstafet();
    }
}
