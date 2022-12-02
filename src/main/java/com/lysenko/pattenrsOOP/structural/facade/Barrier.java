package com.lysenko.pattenrsOOP.structural.facade;

public class Barrier {
    boolean barrier;

    public boolean isBarrier() {
        return barrier;
    }

    public void runWith() {
        System.out.println("run with barrier 25 m/s");
        barrier = true;
    }

    public void runWithout() {
        System.out.println("run without 35 m/s");
        barrier = false;
    }
}
