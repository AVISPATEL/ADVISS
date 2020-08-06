package com.adviss.schoolservice.service;

import com.adviss.schoolservice.school.SchoolPojoDBMapping;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolServiceInterface {
    List<SchoolPojoDBMapping> findAll();
    void save(SchoolPojoDBMapping theSchool);
    void deleteById(int id);
    SchoolPojoDBMapping findAll(int id);
}
