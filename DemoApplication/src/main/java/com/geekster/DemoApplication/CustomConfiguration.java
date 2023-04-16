package com.geekster.DemoApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Configuration to handel beans
@Configuration
public class CustomConfiguration {
    @Bean
    public Student getStudent(){
        System.out.println("Spring call in configuration bean of student");
        return new Student("Komal");
    }
}
