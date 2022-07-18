package com.taller.services;


import com.taller.persitence.entity.Course;
import java.util.List;


public interface CourseService {

    List<Course> findAll();

    Course save(Course course);

    void deleteById(Long id);


}
