package com.lysenko.pattenrsOOP.structural.composite;

public class Run {
    public static void main(String[] args) {
        Composite composite = new Composite();

        composite.addAthlets(new Runner());
        composite.addAthlets(new Runner());
        composite.addAthlets(new Skier());

        composite.runAthlets();
    }
}
