package com.strategy.pattern.camera_app;

import java.util.logging.Logger;

public class Text implements ShareStrategy{
    private static final Logger LOGGER = Logger.getLogger(Text.class.getName());

    @Override
    public void share() {
        LOGGER.info("Sharing the photo via texting!!");
    }
}
