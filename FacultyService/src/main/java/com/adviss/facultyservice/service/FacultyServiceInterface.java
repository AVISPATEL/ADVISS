package com.adviss.facultyservice.service;

import com.adviss.facultyservice.faculty.FacultyPojoDBMapping;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FacultyServiceInterface {
    List<FacultyPojoDBMapping> findAll();

    FacultyPojoDBMapping findAll(int id);
    void save(FacultyPojoDBMapping theFacultyDetails);
    void deleteById(int id);
    int findUser(String emailId);
}
