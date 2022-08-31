package com.strategy.pattern.camera_app;

import java.util.logging.Logger;

public class SocialMedia implements ShareStrategy{
    private static final Logger LOGGER = Logger.getLogger(SocialMedia.class.getName());

    @Override
    public void share() {
        LOGGER.info("Sharing the photo via Social Media!!");
    }
}
