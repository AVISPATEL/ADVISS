package com.avi.school_details.service;

import com.avi.school_details.dao.School_repository;
import com.avi.school_details.entity.School_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class School_details_service_impl implements School_details_service{
    @Autowired
    private School_repository schoolRepository;


    public School_details_service_impl(School_repository theSchoolRepository){
        schoolRepository=theSchoolRepository;
    }

    @Override
    public List<School_details> findAll() {
        return (List<School_details>) schoolRepository.findAll();
    }

    @Override
    public void save(School_details theSchool) {
        schoolRepository.save(theSchool);
    }

    @Override
    public void deleteById(int id) {
        schoolRepository.deleteById(id);
    }
}
