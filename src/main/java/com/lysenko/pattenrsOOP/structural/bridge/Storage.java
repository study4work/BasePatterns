package com.lysenko.pattenrsOOP.structural.bridge;

public class Storage extends Buildings {

    public Storage(Builder builder) {
        super(builder);
    }

    public void buildingType() {
        System.out.println("Media center");
        builder.builConstractions();
    }
}
