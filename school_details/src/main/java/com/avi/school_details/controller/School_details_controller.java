package com.avi.school_details.controller;

import com.avi.school_details.dao.School_repository;
import com.avi.school_details.entity.School_details;
import com.avi.school_details.service.School_details_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school_details")
public class School_details_controller {

    @Autowired
    private School_details_service schoolDetailsService1;

    @Autowired
    private School_repository schoolRepository;

    public School_details_controller(School_details_service theSchoolDetailsService1){
        schoolDetailsService1=theSchoolDetailsService1;
    }

    @GetMapping("/list")
    public List<School_details> school_details_list(){
        List<School_details> all = schoolDetailsService1.findAll();
        System.out.println(all);
        return all;
    }
    @GetMapping("/list/{id}")
    public School_details findbyId(@PathVariable int id){
        School_details theSchoolDetails=schoolDetailsService1.findAll(id);
        if(theSchoolDetails==null) {
            throw new RuntimeException();
        }
        return theSchoolDetails;
    }
    @PostMapping("/list")
    public String create(@RequestBody School_details theSchoolDetails){
        schoolDetailsService1.save(theSchoolDetails);
        return "done";
    }
    @PutMapping("/list")
    public void update(@RequestBody School_details theSchoolDetails){
        schoolDetailsService1.save(theSchoolDetails);

    }
    @DeleteMapping("/list/{id}")
    public void delete(@PathVariable int id){
        School_details theSchoolDetails=schoolDetailsService1.findAll(id);
        if(theSchoolDetails==null){
            throw new RuntimeException();
        }
        schoolDetailsService1.deleteById(id);

    }

}
