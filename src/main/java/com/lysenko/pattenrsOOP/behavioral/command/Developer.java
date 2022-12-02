package com.lysenko.pattenrsOOP.behavioral.command;

public class Developer {
    Command select;
    Command update;
    Command insert;
    Command delete;

    public Developer(Command select, Command update, Command insert, Command delete) {
        this.select = select;
        this.update = update;
        this.insert = insert;
        this.delete = delete;
    }

    public void insert() {
        insert.excecute();
    }

    public void select() {
        select.excecute();
    }

    public void update() {
        update.excecute();
    }

    public void delete() {
        delete.excecute();
    }
}
