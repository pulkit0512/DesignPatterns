package com.observer.pattern.event_subscription;

import com.observer.pattern.event_subscription.editor.Editor;
import com.observer.pattern.event_subscription.observers.EmailNotificationObserver;
import com.observer.pattern.event_subscription.observers.LogOpenObserver;

/*
In this example, the Observer pattern establishes indirect collaboration between objects of a text editor.
Each time the Editor object changes, it notifies its Observers. EmailNotificationObserver and LogOpenObserver react to
these notifications by executing their primary behaviors.

Observer classes are not coupled to the editor class and can be reused in other apps if needed. The Editor class depends
only on the abstract Observer interface. This allows adding new Observer types without changing the editor’s code.
 */

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenObserver("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationObserver("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
