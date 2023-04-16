package com.geekster.DemoApplication;

import org.springframework.stereotype.Component;
//component automatically call  the bean
@Component
public class Teacher {

    public String teach(){
        return "He is teaching spring boot";
    }
}
