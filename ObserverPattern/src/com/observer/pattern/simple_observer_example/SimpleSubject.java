package com.observer.pattern.simple_observer_example;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject{
    List<Observer> observers;
    private int value;

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
    }
}
