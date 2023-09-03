package com.geekster.Annotation.Controller;

import com.geekster.Annotation.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    Students s;
    @GetMapping("name")
    public Students getStudent(){
        return  s;
    }
}
