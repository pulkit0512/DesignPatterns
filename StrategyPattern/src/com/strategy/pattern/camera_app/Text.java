package com.strategy.pattern.camera_app;

public class Text implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Sharing the photo via texting!!");
    }
}
