package com.strategy.pattern.camera_app;

import java.util.logging.Logger;

public abstract class PhoneCameraApp {
    private static final Logger LOGGER = Logger.getLogger(PhoneCameraApp.class.getName());

    private ShareStrategy shareStrategy;

    public void share() {
        shareStrategy.share();
    }

    public void take() {
        LOGGER.info("Taking the Photo");
    }

    public void save() {
        LOGGER.info("Saving the Photo");
    }

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public abstract void edit();
}
