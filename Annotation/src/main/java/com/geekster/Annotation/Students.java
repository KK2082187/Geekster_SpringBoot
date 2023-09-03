package com.geekster.Annotation;

public class Students {
    private String name;
    public Students(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public Students(){
        System.out.println("Student called from spring frame");
    }
}
