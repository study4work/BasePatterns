package com.lysenko.pattenrsOOP.behavioral.command;

public class UpdateCommand implements Command{
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void excecute() {
        database.update();
    }
}
