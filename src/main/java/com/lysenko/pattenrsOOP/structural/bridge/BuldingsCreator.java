package com.lysenko.pattenrsOOP.structural.bridge;

public class BuldingsCreator {
    public static void main(String[] args) {
       Buildings house = new House(new WoodBuilder());
       house.buildingType();
       Buildings storage = new Storage(new BrickBuilder());
       storage.buildingType();
    }
}
