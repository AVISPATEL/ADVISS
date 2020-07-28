package com.avi.school_details.service;

import com.avi.school_details.entity.School_details;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface School_details_service{

    List<School_details> findAll();

    void  save(School_details theSchool);

    void  deleteById(int id);

    School_details findAll(int id);



}
