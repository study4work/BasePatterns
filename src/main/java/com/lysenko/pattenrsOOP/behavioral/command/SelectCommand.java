package com.lysenko.pattenrsOOP.behavioral.command;

public class SelectCommand implements Command{
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void excecute() {
        database.secelt();
    }
}
