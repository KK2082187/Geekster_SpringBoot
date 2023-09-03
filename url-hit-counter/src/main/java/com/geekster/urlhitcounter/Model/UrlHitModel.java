package com.geekster.urlhitcounter.Model;

public class UrlHitModel {
    private String userName;
    private int count;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public UrlHitModel(String userName, int count) {
        this.userName = userName;
        this.count = count;
    }
}
