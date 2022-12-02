package com.lysenko.pattenrsOOP.structural.bridge;

public class House extends Buildings {

    public House(Builder builder) {
        super(builder);
    }

    public void buildingType() {
        System.out.println("Town House");
        builder.builConstractions();
    }
}
