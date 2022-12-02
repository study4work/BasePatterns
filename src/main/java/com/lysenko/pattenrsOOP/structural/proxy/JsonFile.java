package com.lysenko.pattenrsOOP.structural.proxy;

public class JsonFile implements File {
    String url;

    public JsonFile(String url) {
        this.url = url;
        loadFile();
    }

    public void loadFile() {
        System.out.println("Loading file From url " + url);
    }

    @Override
    public void readingFile() {
        System.out.println("Reading file from " + url);
    }
}
