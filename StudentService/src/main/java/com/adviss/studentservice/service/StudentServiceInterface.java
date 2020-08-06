package com.adviss.studentservice.service;

import com.adviss.studentservice.student.StudentPojoDBMapping;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentServiceInterface {
    List<StudentPojoDBMapping> findAll();

    StudentPojoDBMapping findAll(int id);

    void save(StudentPojoDBMapping theStudent);

    void deleteById(int id);
}
