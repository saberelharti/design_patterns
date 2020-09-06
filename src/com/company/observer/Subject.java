package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> listObservers = new ArrayList<>();

    public void addObserver(Observer obs) {
        listObservers.add(obs);
    }

    public void removeObserver(Observer obs) {
        listObservers.remove(obs);
    }

    public void notifyObservers() {
        for (Observer observer :
                listObservers) {
            observer.update();
        }
    }
}
