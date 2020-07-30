package com.avi.student_details.service;

import com.avi.student_details.dao.Student_repository;
import com.avi.student_details.entity.Student_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Configuration
public class Student_details_service_impl implements Student_details_service {

    @Autowired
    private Student_repository studentRepository;

    public Student_details_service_impl(Student_repository theStudentRepository){
        studentRepository=theStudentRepository;
    }

    @Override
    public List<Student_details> findAll() {
        return (List<Student_details>) studentRepository.findAll();
    }

    @Override
    public Student_details findAll(int id) {
        Optional<Student_details> allById = studentRepository.findAllById(id);
        if(allById.isPresent()) {
            return allById.get();
        }
        return null;

    }

    @Override
    public void save(Student_details theStudent) {
        studentRepository.save(theStudent);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
