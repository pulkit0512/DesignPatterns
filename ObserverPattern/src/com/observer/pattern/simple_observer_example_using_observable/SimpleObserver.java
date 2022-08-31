package com.observer.pattern.simple_observer_example_using_observable;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

public class SimpleObserver implements Observer {
    private static final Logger LOGGER = Logger.getLogger(SimpleObserver.class.getName());

    private int value;
    private Observable observable;

    public SimpleObserver(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        LOGGER.info((String) arg);
        
        if(o instanceof SimpleSubject){
            SimpleSubject simpleSubject = (SimpleSubject)o;
            this.value = simpleSubject.getValue();
            display();
        }
    }

    private void display() {
        String msg = "Value: " + value;
        LOGGER.info(msg);
    }
}
