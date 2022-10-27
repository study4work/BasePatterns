package com.lysenko.pattenrsOOP.creational.factoryMethod;

import com.lysenko.pattenrsOOP.creational.factoryMethod.products.Americano;
import com.lysenko.pattenrsOOP.creational.factoryMethod.products.Coffe;

public class AmericanoFromCM extends CoffeMachine {
    //creation new object of americano
    public Coffe createTypeofCoffe() {
        return new Americano();
    }
}
