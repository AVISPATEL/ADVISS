package com.avi.student_details.service;

import com.avi.student_details.entity.Student_details;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Student_details_service {
    List<Student_details> findAll();

    Student_details findAll(int id);

    void save(Student_details theStudent);

    void deleteById(int id);
}
