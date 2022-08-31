package com.strategy.pattern.camera_app;

import java.util.Scanner;

public class PhotoWithPhone {
    public static void main(String[] args) {
        PhoneCameraApp cameraApp = new CameraPlusApp();
        String share = getShareStrategy();

        if(share.equals("e")){
            cameraApp.setShareStrategy(new Email());
        }else if(share.equals("s")){
            cameraApp.setShareStrategy(new SocialMedia());
        }else{
            cameraApp.setShareStrategy(new Text());
        }

        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.share();
    }

    private static String getShareStrategy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Share with text (t), email (e), or social media (s)?");
        String appName = sc.next();
        sc.close();
        return appName;
    }
}
