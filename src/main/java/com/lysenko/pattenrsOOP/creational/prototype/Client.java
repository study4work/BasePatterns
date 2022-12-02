package com.lysenko.pattenrsOOP.creational.prototype;

public class Client {
    public static void main(String[] args) {
        BadmintonRacket racket = new BadmintonRacket("Victor", 14);
        System.out.println(racket);

        RacketFactory factory = new RacketFactory(racket);
        BadmintonRacket clone = factory.cloneRacket();
        System.out.println(clone);


    }
}
