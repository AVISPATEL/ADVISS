package com.avi.faculty_details.service;

import com.avi.faculty_details.entity.Faculty_details;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Faculty_details_service {
    List<Faculty_details> findAll();

    Faculty_details findAll(int id);

    void save(Faculty_details theFacultyDetails);

    void deleteById(int id);
}
