package com.strategy.pattern.camera_app;

public abstract class PhoneCameraApp {
    private ShareStrategy shareStrategy;

    public void share() {
        shareStrategy.share();
    }

    public void take() {
        System.out.println("Taking the Photo");
    }

    public void save() {
        System.out.println("Saving the Photo");
    }

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public abstract void edit();
}
