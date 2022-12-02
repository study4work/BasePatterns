package com.lysenko.pattenrsOOP.behavioral.command;

public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void excecute() {
        database.delete();
    }
}
