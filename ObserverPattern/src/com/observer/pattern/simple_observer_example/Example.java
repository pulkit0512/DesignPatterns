package com.observer.pattern.simple_observer_example;

import java.util.logging.Logger;

public class Example {
    private static final Logger LOGGER = Logger.getLogger(Example.class.getName());

    public static void main(String[] args) throws InterruptedException {
        SimpleSubject subject = new SimpleSubject();
        Observer observer = new SimpleObserver(subject);

        int value = 100;
        while(value>=0) {
            subject.setValue(value);
            subject.notifyObservers();
            value -= 10;
            Thread.sleep(2000);
        }

        LOGGER.info("Removing Observer!!");
        subject.removeObserver(observer);
        // New value -10 will not display now since we have removed the observer.
        subject.notifyObservers();
    }
}
