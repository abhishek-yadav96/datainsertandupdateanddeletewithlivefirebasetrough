package com.example.zoconut;

public class uploadinfo {
    public String imageName;
    public String googleSign;

    public String getGoogleSign() {
        return googleSign;
    }

    public void setGoogleSign(String googleSign) {
        this.googleSign = googleSign;
    }

    public String imageURL;
    public uploadinfo(){}

    public uploadinfo(String name, String url) {
        this.imageName = name;
        this.imageURL = url;
    }

    public String getImageName() {
        return imageName;
    }
    public String getImageURL() {
        return imageURL;
    }
}
