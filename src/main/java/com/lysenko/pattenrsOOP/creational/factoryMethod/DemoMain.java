package com.lysenko.pattenrsOOP.creational.factoryMethod;

public class DemoMain {

    public static void main(String[] args) {
        CoffeMachine  machine = createCoffeByName("capuchino");
        machine.giveMeTaste();
    }

    //this method allow us to make coffe entering the name to signature of method
    static CoffeMachine createCoffeByName(String string) {
        if (string.equalsIgnoreCase("americano")) {
            return new AmericanoFromCM();
        }
        if (string.equalsIgnoreCase("capuchino")) {
            return new CapuchinoFromCM();
        }
        return null;
    }
}
