package com.lysenko.pattenrsOOP.creational.factoryMethod;

import com.lysenko.pattenrsOOP.creational.factoryMethod.products.Capuchino;
import com.lysenko.pattenrsOOP.creational.factoryMethod.products.Coffe;

public class CapuchinoFromCM extends CoffeMachine {
    //creation of new object capuchino
    public Coffe createTypeofCoffe() {
        return new Capuchino();
    }
}
