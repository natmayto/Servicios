package com.taller.services;

import com.taller.persitence.entity.Instructor;

import java.util.List;
import java.util.Optional;

public interface InstructorService {
    List<Instructor> findAll();

    Instructor save(Instructor instructor);

    List<Instructor> findAllById(Long id);
}
