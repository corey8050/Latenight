package com.example.shakeapp;

public class Model {


    String sShakeName;
    String sShakeDetail;
    int sShakePhoto;

    public Model(String sShakeName, String sShakeDetail, int sShakePhoto) {
        this.sShakeName = sShakeName;
        this.sShakeDetail = sShakeDetail;
        this.sShakePhoto = sShakePhoto;
    }




    public String getsShakeName() {
        return sShakeName;
    }

    public String getsShakeDetail() {
        return sShakeDetail;
    }

    public int getsShakePhoto() {
        return sShakePhoto;
    }
}
