package com.geekster.Annotation.Controller;

import com.geekster.Annotation.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    //Autowired what ever bean come
    @Autowired
    Teacher t;
    @GetMapping("/teach")
    public String teach(){
        return t.teach();
    }
}
