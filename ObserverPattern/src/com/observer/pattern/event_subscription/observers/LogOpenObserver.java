package com.observer.pattern.event_subscription.observers;

import java.io.File;
import java.util.logging.Logger;

public class LogOpenObserver implements Observer {
    private static final Logger LOGGER = Logger.getLogger(LogOpenObserver.class.getName());
    private final File log;

    public LogOpenObserver(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        String msg = "Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName();
        LOGGER.info(msg);
    }
}
