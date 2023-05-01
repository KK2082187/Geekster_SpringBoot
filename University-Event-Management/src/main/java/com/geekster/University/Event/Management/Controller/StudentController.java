package com.geekster.University.Event.Management.Controller;

import com.geekster.University.Event.Management.Model.Student;
import com.geekster.University.Event.Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping(value="/addStudent")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student add Successfully Student id: "+student.getStudentId()+" "+student.getFirstName();
    }

    @GetMapping(value = "/find-student/studentId/{studentId}")
    public Student findById(@PathVariable int studentId){
        Student student=studentService.findById(studentId);
        return student;
    }
    @GetMapping(value="/find-all-student")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PutMapping(value = "/update-student/studentId/{studentId}/department/{department}")
    public String updateById(@PathVariable int studentId,@PathVariable String department){
        studentService.updateStudent(studentId,department);
        return "Update Student successfully ";
    }
    @DeleteMapping(value="/delete-student/studentId/{studentId}")
    public String deleteById(@PathVariable int studentId){
        studentService.deleteStudent(studentId);
        return "Student Deleted Successfully";
    }
}
