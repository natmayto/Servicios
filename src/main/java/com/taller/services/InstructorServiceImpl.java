package com.taller.services;

import com.taller.persitence.entity.Instructor;
import com.taller.persitence.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService{

    private final InstructorRepository instructorRepository;


    @Override
    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor save(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> findAllById(Long id) {
        return findAllById(id);
    }


}
