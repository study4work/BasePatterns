package com.lysenko.pattenrsOOP.behavioral.visitor;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer developer = new JuniorDeveloper();
        Developer developer1 = new SeniorDeveloper();

        project.beWritten(developer);
        project.beWritten(developer1);
    }
}
