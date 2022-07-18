package com.taller.services;

import com.taller.persitence.entity.Course;
import com.taller.persitence.repository.CourseRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;



import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;


    @Override
    public List<Course> findAll() {

        return courseRepository.findAll();
    }

    @Override
    public Course save(Course course) {

        return courseRepository.save(course);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }
}
