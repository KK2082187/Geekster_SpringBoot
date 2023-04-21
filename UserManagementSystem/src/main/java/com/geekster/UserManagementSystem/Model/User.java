package com.geekster.UserManagementSystem.Model;

import lombok.AllArgsConstructor;


public class User {
    private Integer userId;
    private String name;
    private String userName;
    private String address;
    private String phoneNo;
    public User(Integer userId,String name,String userName,String address,String phoneNo){
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.phoneNo = phoneNo;
    }
    public Integer getUserId(){
        return userId;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
}
