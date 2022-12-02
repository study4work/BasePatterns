package com.lysenko.pattenrsOOP.behavioral.state;

public class Day {
    public static void main(String[] args) {
        Activity activity = new Coding();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.jusDoIt();
            developer.changeActivity();
        }
    }
}
