package com.lysenko.pattenrsOOP.structural.adapter;

public class OldSUV {
    public static void main(String[] args) {
        Auto auto = new AutoAdapter();
        auto.run();
        auto.stop();
    }
}
