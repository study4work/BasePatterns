package com.lysenko.pattenrsOOP.creational.builder;

import com.lysenko.pattenrsOOP.creational.builder.developer.Builder;
import com.lysenko.pattenrsOOP.creational.builder.developer.Developer;
import com.lysenko.pattenrsOOP.creational.builder.developer.Type;

public class DeveloperBuilder implements Builder {
    private String name;
    private Type type;
    private String salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Developer getResult() {
        return new Developer(name, type, salary);
    }
}
