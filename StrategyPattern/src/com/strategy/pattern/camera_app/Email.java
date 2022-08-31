package com.strategy.pattern.camera_app;

import java.util.logging.Logger;

public class Email implements ShareStrategy{
    private static final Logger LOGGER = Logger.getLogger(Email.class.getName());

    @Override
    public void share() {
        LOGGER.info("Sharing the photo via Email!!");
    }
}
