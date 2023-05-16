package com.geekster.Mapping.Service;

import com.geekster.Mapping.Model.Course;
import com.geekster.Mapping.Repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;


    public String addedCourse(Course course) {
        iCourseRepo.save(course);
        return "Added course";
    }
    public List<Course>courses (Course course){
        return  iCourseRepo.findAll();
    }

    public String deleteCourse(String id) {
        iCourseRepo.deleteById(id);
        return "Deleted";
    }
}
