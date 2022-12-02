package com.lysenko.pattenrsOOP.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{
    User admin;
    List<User> list = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user) {
        this.list.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
    for(User u: list) {
        if (u != user) {
            u.getMessage(message);
        }
    }
    admin.getMessage(message);
    }
}
