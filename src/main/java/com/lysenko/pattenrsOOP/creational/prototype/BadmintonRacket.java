package com.lysenko.pattenrsOOP.creational.prototype;

public class BadmintonRacket implements Copybale {

    private String brand;
    private int tension;

    public BadmintonRacket(String brand, int tension) {
        this.brand = brand;
        this.tension = tension;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTension() {
        return tension;
    }

    public void setTension(int tension) {
        this.tension = tension;
    }

    public Object copy() {
        BadmintonRacket copy = new BadmintonRacket(brand, tension);
        return copy;
    }

    @Override
    public String toString() {
        return "BadmintonRacket{" +
                "brand='" + brand + '\'' +
                ", tension=" + tension +
                '}';
    }
}
