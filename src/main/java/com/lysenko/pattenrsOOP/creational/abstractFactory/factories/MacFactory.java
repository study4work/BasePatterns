package com.lysenko.pattenrsOOP.creational.abstractFactory.factories;

import com.lysenko.pattenrsOOP.creational.abstractFactory.notebook.MacNotebok;
import com.lysenko.pattenrsOOP.creational.abstractFactory.notebook.Notebok;
import com.lysenko.pattenrsOOP.creational.abstractFactory.phone.MacPhone;
import com.lysenko.pattenrsOOP.creational.abstractFactory.phone.Phone;

public class MacFactory implements DeviceFactory {
    public Phone createPhone() {
        return new MacPhone();
    }

    public Notebok createNotebok() {
        return new MacNotebok();
    }
}
