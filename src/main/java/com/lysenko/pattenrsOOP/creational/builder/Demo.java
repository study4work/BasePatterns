package com.lysenko.pattenrsOOP.creational.builder;

import com.lysenko.pattenrsOOP.creational.builder.developer.Developer;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        DeveloperBuilder builder = new DeveloperBuilder();

        // creating C developer with parameters from director
        director.consturctCDeveloper(builder);
        Developer cDeveloper = builder.getResult();
        System.out.println(cDeveloper);

        // creating java developer with parameters from director
        director.consturctJavaDeveloper(builder);
        Developer javaDev = builder.getResult();
        System.out.println(javaDev);

        // creating C junior developer with parameters from director
        director.consturctCJuniorDeveloper(builder);
        Developer cJunior = builder.getResult();

        System.out.println(cJunior);
    }
}
