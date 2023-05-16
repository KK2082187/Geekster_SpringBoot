package com.geekster.Mapping.Service;

import com.geekster.Mapping.Model.Address;
import com.geekster.Mapping.Model.Student;
import com.geekster.Mapping.Repository.IAddressRepo;
import com.geekster.Mapping.Repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    public String createStudent(Student student) {
        iStudentRepo.save(student);
        return "Saved student";
    }

    public void getStudent() {
        iStudentRepo.findAll();
    }
}
