package com.observer.pattern.simple_observer_example;

import java.util.logging.Logger;

public class SimpleObserver implements Observer{
    private static final Logger LOGGER = Logger.getLogger(SimpleObserver.class.getName());
    private int value;
    private final Subject simpleSubject;

    public SimpleObserver(Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.addObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    private void display() {
        String msg = "New value is: " + value;
        LOGGER.info(msg);
    }
}
