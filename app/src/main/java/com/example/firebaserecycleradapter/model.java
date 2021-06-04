package com.example.firebaserecycleradapter;

public class model {
    String  aadharNumData, ageData, imageURL2, phoneNumData, verified;

    public model() {

    }

    public model(String aadharNumData, String ageData, String imageURL2, String phoneNumData, String verified) {
        this.aadharNumData = aadharNumData;
        this.ageData = ageData;
        this.imageURL2 = imageURL2;
        this.phoneNumData = phoneNumData;
        this.verified = verified;

    }

    public String getAadharNumData() {
        return aadharNumData;
    }

    public void setAadharNumData(String aadharNumData) {
        this.aadharNumData = aadharNumData;
    }

    public String getAgeData() {
        return ageData;
    }

    public void setAgeData(String ageData) {
        this.ageData = ageData;
    }

    public String getImageURL2() {
        return imageURL2;
    }

    public void setImageURL2(String imageURL2) {
        this.imageURL2 = imageURL2;
    }

    public String getPhoneNumData() {
        return phoneNumData;
    }

    public void setPhoneNumData(String phoneNumData) {
        this.phoneNumData = phoneNumData;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }
}
