package com.geekster.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
    @Bean
    public Students getStudent(){
        System.out.println("Spring call in configuration bean of student");
        return new Students("Komal");
    }
}
