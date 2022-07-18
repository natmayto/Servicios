package com.taller.controller;

import com.taller.persitence.entity.Course;
import com.taller.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public List<Course> findAll(){
        return courseService.findAll();
    }

    @PostMapping
    public Course save(@RequestBody Course course){
        return courseService.save(course);
    }

    @DeleteMapping
    public void deleteById(Long id) {
        courseService.deleteById(id);
    }
}
