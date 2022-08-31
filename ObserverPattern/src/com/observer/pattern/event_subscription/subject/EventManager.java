package com.observer.pattern.event_subscription.subject;

import com.observer.pattern.event_subscription.observers.Observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<Observer>> observers = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.observers.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Observer observer) {
        List<Observer> users = observers.get(eventType);
        users.add(observer);
    }

    public void unsubscribe(String eventType, Observer observer) {
        List<Observer> users = observers.get(eventType);
        users.remove(observer);
    }

    public void notify(String eventType, File file) {
        List<Observer> users = observers.get(eventType);
        for (Observer observer : users) {
            observer.update(eventType, file);
        }
    }
}
