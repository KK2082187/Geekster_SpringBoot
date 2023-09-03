package com.geekster.Annotation;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    public String teach(){
        return "He is teaching springboot";
    }
}
