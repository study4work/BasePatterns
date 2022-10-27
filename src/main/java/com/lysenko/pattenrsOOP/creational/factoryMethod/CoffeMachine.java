package com.lysenko.pattenrsOOP.creational.factoryMethod;

import com.lysenko.pattenrsOOP.creational.factoryMethod.products.Coffe;

//Factory method for product coffe
public abstract class CoffeMachine {

    // method witch we create coffe of type americano or capuchino
    public abstract Coffe createTypeofCoffe();

    // method witch call realization of method depends of type of coffe
    void giveMeTaste() {
        Coffe coffe = createTypeofCoffe();
        coffe.doTaste();
    }

}
