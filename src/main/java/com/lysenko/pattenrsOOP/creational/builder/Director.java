package com.lysenko.pattenrsOOP.creational.builder;

import com.lysenko.pattenrsOOP.creational.builder.developer.Builder;
import com.lysenko.pattenrsOOP.creational.builder.developer.Type;

public class Director {

    public void consturctJavaDeveloper(Builder builder) {
        builder.setName("Alex");
        builder.setType(Type.JAVA);
        builder.setSalary("10 000");
    }


    public void consturctCDeveloper(Builder builder) {
        builder.setName("Bob");
        builder.setType(Type.C);
        builder.setSalary("5 000");
    }

    public void consturctCJuniorDeveloper(Builder builder) {
        builder.setName("JBob");
        builder.setType(Type.C);
        builder.setSalary("");
    }


}
