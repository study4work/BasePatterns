package com.lysenko.pattenrsOOP.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {
    private final List<Athlets> athletsList = new ArrayList<>();

    public void addAthlets(Athlets athlets) {
        athletsList.add(athlets);
    }

    public void runAthlets() {
        for (Athlets athlets: athletsList) {
            athlets.run();
        }
    }


}
