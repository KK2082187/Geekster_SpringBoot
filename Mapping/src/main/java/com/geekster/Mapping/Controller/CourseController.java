package com.geekster.Mapping.Controller;

import com.geekster.Mapping.Model.Course;
import com.geekster.Mapping.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping(value = "addcourses")
    public String courseAdded(@RequestBody Course course){
        return courseService.addedCourse(course);
    }
    @GetMapping(value = "course" )
    public List<Course>getCourse (@RequestBody Course course){
        return courseService.courses(course);
    }
    @DeleteMapping(value = "deleteCourse")
    public String deletedCourse(@PathVariable String id){
        return courseService.deleteCourse(id);
    }
}
