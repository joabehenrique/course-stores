package com.loiane.crudspring.controller;

import com.loiane.crudspring.entity.Course;
import com.loiane.crudspring.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    CourseRepository repository;

    @GetMapping
    public List<Course> findCourses(){
        return repository.findAll();
    }
}
