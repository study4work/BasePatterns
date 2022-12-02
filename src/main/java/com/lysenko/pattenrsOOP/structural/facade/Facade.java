package com.lysenko.pattenrsOOP.structural.facade;

public class Facade {
    Estafeta estafeta = new Estafeta();
    Runner runner = new Runner();
    Barrier barrier = new Barrier();

    public void run() {
        runner.run();
        barrier.runWith();
        estafeta.run(barrier);
    }
}
