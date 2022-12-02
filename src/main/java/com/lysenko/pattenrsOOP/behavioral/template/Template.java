package com.lysenko.pattenrsOOP.behavioral.template;

public abstract class Template {
    public void showPage(){
        System.out.println("Welcome");
        changeContent();
        System.out.println("Goodbye");
    }

    public abstract void changeContent();
}
