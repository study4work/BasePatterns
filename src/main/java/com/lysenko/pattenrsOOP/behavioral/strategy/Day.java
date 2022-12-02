package com.lysenko.pattenrsOOP.behavioral.strategy;

public class Day {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Coding());
        developer.excecute();

        developer.setActivity(new Sleeping());
        developer.excecute();

        developer.setActivity(new Training());
        developer.excecute();
    }
}
