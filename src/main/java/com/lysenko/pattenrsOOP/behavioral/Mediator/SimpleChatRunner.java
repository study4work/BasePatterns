package com.lysenko.pattenrsOOP.behavioral.Mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat textChat = new SimpleTextChat();
        User admin = new Admin(textChat, "Admin");
        User user1 = new SimpleUser(textChat, "User1");
        User user2 = new SimpleUser(textChat, "User2");

        textChat.setAdmin(admin);
        textChat.addUser(user1);
        textChat.addUser(user2);

        user1.sendMessage("User1 send message");
        admin.sendMessage("admin message");

    }
}
