package com.lysenko.pattenrsOOP.structural.decorator;

public class Estafeta {
    public static void main(String[] args) {
        Athlets athlets = new LongDistanceRunner(new SprintRunner(new Runner()));
        System.out.println(athlets.run());
    }
}
