package com.example.project_kgu_eats.data;

import java.util.Date;

public class MyPurchasing {

    String restName;
    String date;
    String isUsed;

    public MyPurchasing(String restName, String date, String isUsed) {
        this.restName = restName;
        this.date = date;
        this.isUsed = isUsed;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }
}
