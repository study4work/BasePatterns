package com.lysenko.pattenrsOOP.structural.adapter;

public class AutoAdapter extends OldAuto implements Auto {
    public void run() {
        oldRun();
    }

    public void stop() {
        oldStop();
    }
}
