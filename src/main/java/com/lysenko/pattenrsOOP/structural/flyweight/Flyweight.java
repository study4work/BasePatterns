package com.lysenko.pattenrsOOP.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Flyweight {
    public static void main(String[] args) {
        AthletsFactory factory = new AthletsFactory();

        List<Athelts> list = new ArrayList<>();

        list.add(factory.getAthletBySpecialty("badminton"));
        list.add(factory.getAthletBySpecialty("badminton"));
        list.add(factory.getAthletBySpecialty("badminton"));
        list.add(factory.getAthletBySpecialty("badminton"));
        list.add(factory.getAthletBySpecialty("ski"));
        list.add(factory.getAthletBySpecialty("ski"));
        list.add(factory.getAthletBySpecialty("ski"));
        list.add(factory.getAthletBySpecialty("ski"));
        list.add(factory.getAthletBySpecialty("ski"));

        for(Athelts athelts: list) {
            athelts.doSport();
        }


    }
}
