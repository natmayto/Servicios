package com.taller.controller;

import com.taller.persitence.entity.Instructor;
import com.taller.persitence.repository.InstructorRepository;
import com.taller.services.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/instructors")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @GetMapping
    public List<Instructor> findAll(){
        return instructorService.findAll();
    }

    @PostMapping
    public Instructor save(@RequestBody Instructor instructor){
        return instructorService.save(instructor);
    }

    @PutMapping("/instructors/{id}")
    private ResponseEntity<Instructor> findAllById(Long id) {
        return findAllById(id);
    }
}
