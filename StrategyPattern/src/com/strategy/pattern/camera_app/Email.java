package com.strategy.pattern.camera_app;

public class Email implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Sharing the photo via Email!!");
    }
}
