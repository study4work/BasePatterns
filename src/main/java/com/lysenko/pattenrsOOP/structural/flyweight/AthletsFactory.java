package com.lysenko.pattenrsOOP.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AthletsFactory {
    private static final Map<String, Athelts> athlets = new HashMap<>();

    public Athelts getAthletBySpecialty(String specialty) {
        Athelts athelt = athlets.get(specialty);

        if(athelt == null) {
            switch (specialty) {
                case "badminton":
                    System.out.println("making some badminton athlet");
                    athelt = new Badmintonist();
                    break;
                case  "ski":
                    System.out.println("maiking some ski athlet");
                    athelt = new Skier();
                    break;
            }
            athlets.put(specialty, athelt);
        }
        return athelt;
    }
}
