package com.lysenko.pattenrsOOP.behavioral.visitor;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;

    public Project(){
        this.projectElements = new ProjectElement[]{
                new Database(),
                new Test(),
                new ProjectClass()
        };
    }
    @Override
    public void beWritten(Developer developer) {
    for (ProjectElement element: projectElements) {
        element.beWritten(developer);
    }
    }
}
