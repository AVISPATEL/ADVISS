package com.adviss.schoolservice.controller;

import com.adviss.schoolservice.service.SchoolServiceInterface;
import com.adviss.schoolservice.dataaccesslayer.SchoolRepo;
import com.adviss.schoolservice.school.SchoolPojoDBMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class SchoolServiceImpl implements SchoolServiceInterface {
    @Autowired
    private SchoolRepo schoolRepository;


    public SchoolServiceImpl(SchoolRepo theSchoolRepository){
        schoolRepository=theSchoolRepository;
    }

    @Override
    public List<SchoolPojoDBMapping> findAll() {
        return (List<SchoolPojoDBMapping>) schoolRepository.findAll();
    }

    @Override
    public void save(SchoolPojoDBMapping theSchool) {
        schoolRepository.save(theSchool);
    }

    @Override
    public void deleteById(int id) {
        schoolRepository.deleteById(id);
    }

    @Override
    public SchoolPojoDBMapping findAll(int id) {
        Optional<SchoolPojoDBMapping> allById = schoolRepository.findAllById(id);
        if(allById.isPresent()){
            return  allById.get();
        }
        return null;
    }




}
