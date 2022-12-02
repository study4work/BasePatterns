package com.lysenko.pattenrsOOP.behavioral.visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Junior create project");
    }

    @Override
    public void create(Database database) {
        System.out.println("Junior create database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Junior create test");
    }
}
