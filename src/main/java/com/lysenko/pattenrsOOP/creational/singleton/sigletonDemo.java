package com.lysenko.pattenrsOOP.creational.singleton;

//singleton
public class sigletonDemo {
    public static void main(String[] args) {
        AtomicSingleton singleton = AtomicSingleton.getInstance();
        singleton.incrementByOne();
        singleton.decrementByOne();
    }
}
