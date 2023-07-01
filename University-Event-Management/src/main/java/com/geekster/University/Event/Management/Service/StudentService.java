package com.geekster.University.Event.Management.Service;

import com.geekster.University.Event.Management.Model.Department;
import com.geekster.University.Event.Management.Model.Student;
import com.geekster.University.Event.Management.Repository.IStudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepository iStudentRepository;
    public List<Student> findAll(){
        return iStudentRepository.findAll();
    }
    public Student findById(int studentId){
        return iStudentRepository.findById(studentId);
    }
    public void addStudent(Student student) {
        iStudentRepository.save(student);
    }
    public void deleteStudent(int studentId) {
        iStudentRepository.deleteById(studentId);
    }


    public void updateStudent(int studentId, Department department) {
        Student student=iStudentRepository.findById(studentId);
        student.setDepartment(department);

        iStudentRepository.save(student);
    }
}
