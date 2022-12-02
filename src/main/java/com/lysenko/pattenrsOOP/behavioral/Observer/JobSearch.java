package com.lysenko.pattenrsOOP.behavioral.Observer;

public class JobSearch {
    public static void main(String[] args) {
        HHRu hhRu = new HHRu();
        hhRu.addVacancy("First java vac");
        hhRu.addVacancy("Second java vac");

        Observer firstObserver = new Subscriber("Bob");
        Observer secondObserver = new Subscriber("Yum");

        hhRu.addObserver(firstObserver);
        hhRu.addObserver(secondObserver);


    }
}
