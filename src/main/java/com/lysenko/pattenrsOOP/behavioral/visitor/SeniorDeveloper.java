package com.lysenko.pattenrsOOP.behavioral.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Senior fix project");
    }

    @Override
    public void create(Database database) {
        System.out.println("Senior fix project");
    }

    @Override
    public void create(Test test) {
        System.out.println("Senior fix project");
    }
}
