package com.observer.pattern.event_subscription.observers;

import java.io.File;

public interface Observer {
    void update(String eventType, File file);
}
