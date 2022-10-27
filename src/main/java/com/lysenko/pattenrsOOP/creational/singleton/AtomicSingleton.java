package com.lysenko.pattenrsOOP.creational.singleton;

public class AtomicSingleton {
    private static volatile AtomicSingleton instanse;
    private int number;

    private AtomicSingleton(int number) {
        this.number = number;
    }

    public static synchronized AtomicSingleton getInstance() {
        if (instanse == null) {
            instanse = new AtomicSingleton(0);
        }
        return instanse;
    }

    public void incrementByOne() {
        number += 1;
        System.out.println(number);
    }

    public void decrementByOne() {
        number -= 1;
        System.out.println(number);

    }
}
