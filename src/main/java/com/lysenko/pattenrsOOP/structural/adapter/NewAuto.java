package com.lysenko.pattenrsOOP.structural.adapter;

public class NewAuto implements Auto {
    public void run() {
        System.out.println("new run");
    }

    public void stop() {
        System.out.println("new stop");
    }
}
