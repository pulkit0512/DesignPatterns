package com.observer.pattern.event_subscription.observers;

import java.io.File;
import java.util.logging.Logger;

public class EmailNotificationObserver implements Observer{
    private static final Logger LOGGER = Logger.getLogger(EmailNotificationObserver.class.getName());
    private final String email;

    public EmailNotificationObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        String msg = "Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName();
        LOGGER.info(msg);
    }
}
