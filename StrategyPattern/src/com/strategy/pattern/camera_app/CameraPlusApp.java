package com.strategy.pattern.camera_app;

import java.util.logging.Logger;

public class CameraPlusApp extends PhoneCameraApp{
    private static final Logger LOGGER = Logger.getLogger(CameraPlusApp.class.getName());

    @Override
    public void edit() {
        LOGGER.info("Advanced Photo editing features for professionals.");
    }
}
