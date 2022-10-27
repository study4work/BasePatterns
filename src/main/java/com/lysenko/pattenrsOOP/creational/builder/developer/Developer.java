package com.lysenko.pattenrsOOP.creational.builder.developer;

public class Developer {
    private String name;
    private Type type;
    private String salary;

    public Developer(String name, Type type, String salary) {
        this.name = name;
        this.type = type;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", salary='" + salary + '\'' +
                '}';
    }
}
