package com.lysenko.pattenrsOOP.structural.bridge;

public abstract class Buildings {
    protected Builder builder;

    public Buildings(Builder builder) {
        this.builder = builder;
    }

    public abstract void buildingType();
}
