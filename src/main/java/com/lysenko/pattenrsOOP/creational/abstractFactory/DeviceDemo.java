package com.lysenko.pattenrsOOP.creational.abstractFactory;

import com.lysenko.pattenrsOOP.creational.abstractFactory.factories.DeviceFactory;
import com.lysenko.pattenrsOOP.creational.abstractFactory.factories.MacFactory;
import com.lysenko.pattenrsOOP.creational.abstractFactory.factories.WinFactory;
import com.lysenko.pattenrsOOP.creational.abstractFactory.notebook.Notebok;
import com.lysenko.pattenrsOOP.creational.abstractFactory.phone.Phone;

public class DeviceDemo {
    public static void main(String[] args) {
        DeviceFactory factory = new MacFactory();
        Phone macPhone = factory.createPhone();
        Notebok macNotebok = factory.createNotebok();

        macNotebok.notebokModel();
        macPhone.phoneModel();

        DeviceFactory factory1 = new WinFactory();
        Phone winPhone = factory1.createPhone();
        Notebok winNotebok = factory1.createNotebok();

        winNotebok.notebokModel();
        winPhone.phoneModel();




    }
}
