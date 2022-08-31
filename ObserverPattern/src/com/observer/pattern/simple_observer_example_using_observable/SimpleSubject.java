package com.observer.pattern.simple_observer_example_using_observable;

import java.util.Observable;

public class SimpleSubject extends Observable {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers("Value Changed!!");
    }
}
