package com.geekster.DemoApplication.Controller;

import com.geekster.DemoApplication.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    //Autowired to what ever in bean come in autowired
    @Autowired
    Student s1;
    @GetMapping("/student")
    public Student getStudent(){
        return s1;
    }
}
