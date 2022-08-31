package com.strategy.pattern.camera_app;

public class SocialMedia implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Sharing the photo via Social Media!!");
    }
}
