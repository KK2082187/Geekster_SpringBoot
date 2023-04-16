package com.geekster.DemoApplication;

public class Student {
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public Student(){
        System.out.println("Student called from spring frame-1");
    }
    public Student(String name){
        this.name = name;
    }
}
