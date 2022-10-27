package com.lysenko.pattenrsOOP.creational.abstractFactory.factories;

import com.lysenko.pattenrsOOP.creational.abstractFactory.notebook.Notebok;
import com.lysenko.pattenrsOOP.creational.abstractFactory.phone.Phone;

public interface DeviceFactory {
    Phone createPhone();
    Notebok createNotebok();
}
