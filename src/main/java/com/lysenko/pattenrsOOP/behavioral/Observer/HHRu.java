package com.lysenko.pattenrsOOP.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class HHRu implements Observed{
    List<String> vacancy = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancy.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancy.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
    this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: subscribers) {
            o.handleEvent(this.vacancy);
        }

    }
}
