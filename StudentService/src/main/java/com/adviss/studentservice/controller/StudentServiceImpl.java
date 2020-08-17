package com.adviss.studentservice.controller;

import com.adviss.studentservice.dataaccesslayer.StudentRepo;
import com.adviss.studentservice.service.StudentServiceInterface;
import com.adviss.studentservice.student.StudentPojoDBMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class StudentServiceImpl implements StudentServiceInterface {

    @Autowired
    private StudentRepo studentRepository;

    public StudentServiceImpl(StudentRepo theStudentRepository){
        studentRepository=theStudentRepository;
    }

    @Override
    public List<StudentPojoDBMapping> findAll() {
        return (List<StudentPojoDBMapping>) studentRepository.findAll();
    }

    @Override
    public StudentPojoDBMapping findAll(int id) {
        Optional<StudentPojoDBMapping> allById = studentRepository.findAllById(id);
        if(allById.isPresent()) {
            return allById.get();
        }
        return null;

    }

    @Override
    public void save(StudentPojoDBMapping theStudent) {
        studentRepository.save(theStudent);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public int findUser(String emailId) {
        List<StudentPojoDBMapping> theStudent=studentRepository.findUser(emailId);
        return theStudent.get(1).getId();

    }
}
