package com.lysenko.pattenrsOOP.structural.proxy;

public class JsonFileProxy implements File {
    private String url;
    private JsonFile jsonFile;

    public JsonFileProxy(String url) {
        this.url = url;
    }

    @Override
    public void readingFile() {
    if(jsonFile == null) {
        jsonFile = new JsonFile(url);
    }
    jsonFile.readingFile();
    }
}
