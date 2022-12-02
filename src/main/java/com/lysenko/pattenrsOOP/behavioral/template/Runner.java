package com.lysenko.pattenrsOOP.behavioral.template;

public class Runner {
    public static void main(String[] args) {
        Template welcome = new WlecomePage();
        Template news = new NewsPage();

        welcome.showPage();

        news.showPage();
    }
}
