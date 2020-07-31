package com.avi.faculty_details.service;

import com.avi.faculty_details.dao.Faculty_repository;
import com.avi.faculty_details.entity.Faculty_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class Faculty_details_service_Impl implements Faculty_details_service{

    @Autowired
    private Faculty_repository facultyRepository;

    public Faculty_details_service_Impl(Faculty_repository theFacultyRepository){
        facultyRepository=theFacultyRepository;
    }
    @Override
    public List<Faculty_details> findAll() {
        return (List<Faculty_details>) facultyRepository.findAll();
    }

    @Override
    public Faculty_details findAll(int id) {
        Optional<Faculty_details> allById = facultyRepository.findAllById(id);
        if(allById.isPresent()){
            return allById.get();
        }
        return null;
    }

    @Override
    public void save(Faculty_details theFacultyDetails) {
        facultyRepository.save(theFacultyDetails);
    }

    @Override
    public void deleteById(int id) {
        facultyRepository.deleteById(id);
    }
}
