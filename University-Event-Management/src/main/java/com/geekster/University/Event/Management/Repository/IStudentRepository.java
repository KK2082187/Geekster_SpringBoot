package com.geekster.University.Event.Management.Repository;

import com.geekster.University.Event.Management.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer> {
    public List<Student> findAll();
    public Student findById(int id) ;
    public void addStudent(Student student);
    public void deleteStudent(int id) ;
    public void updateStudent(int id,String department) ;
}
