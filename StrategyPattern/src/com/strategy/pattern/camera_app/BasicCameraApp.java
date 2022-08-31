package com.strategy.pattern.camera_app;

import java.util.logging.Logger;

public class BasicCameraApp extends PhoneCameraApp{
    private static final Logger LOGGER = Logger.getLogger(BasicCameraApp.class.getName());

    @Override
    public void edit() {
        LOGGER.info("Camera with Basic Editing Features.");
    }
}
