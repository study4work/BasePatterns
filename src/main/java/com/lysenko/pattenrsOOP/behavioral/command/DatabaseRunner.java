package com.lysenko.pattenrsOOP.behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new SelectCommand(database),
                new UpdateCommand(database),
                new InsertCommand(database),
                new DeleteCommand(database)
        );

        developer.insert();
        developer.select();
        developer.update();
        developer.delete();
    }
}
