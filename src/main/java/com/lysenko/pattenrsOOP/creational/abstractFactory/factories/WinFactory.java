package com.lysenko.pattenrsOOP.creational.abstractFactory.factories;

import com.lysenko.pattenrsOOP.creational.abstractFactory.notebook.Notebok;
import com.lysenko.pattenrsOOP.creational.abstractFactory.notebook.WindowsNotebok;
import com.lysenko.pattenrsOOP.creational.abstractFactory.phone.Phone;
import com.lysenko.pattenrsOOP.creational.abstractFactory.phone.WindowsPhone;

public class WinFactory implements DeviceFactory {
    public Phone createPhone() {
        return new WindowsPhone();
    }

    public Notebok createNotebok() {
        return new WindowsNotebok();
    }
}
