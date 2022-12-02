package com.lysenko.pattenrsOOP.behavioral.command;

public class InsertCommand implements Command{
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void excecute() {
        database.insert();
    }
}
