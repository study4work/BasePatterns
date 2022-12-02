package com.lysenko.pattenrsOOP.structural.facade;

public class Estafeta {
    public void run(Barrier barrier) {
        if (barrier.isBarrier()) {
            System.out.println("run slow");
        } else {
            System.out.println("run fast");
        }
    }
}
