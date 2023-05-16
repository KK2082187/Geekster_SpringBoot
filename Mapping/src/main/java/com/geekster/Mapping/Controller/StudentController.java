package com.geekster.Mapping.Controller;

import com.geekster.Mapping.Model.Address;
import com.geekster.Mapping.Model.Student;
import com.geekster.Mapping.Service.StudentService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping(value="student")
    public String saveStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @GetMapping(value = "getStudent")
    public void getAddress(){
        studentService.getStudent();
    }
}
