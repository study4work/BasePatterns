package com.lysenko.pattenrsOOP.structural.proxy;

public class Client {
    public static void main(String[] args) {
        File jsonFile = new JsonFileProxy("www.habr.com");
        jsonFile.readingFile();
    }
}
