package com.avi.school_details.controller;

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

    public School_details_controller(School_details_service theSchoolDetailsService1){
        schoolDetailsService1=theSchoolDetailsService1;
    }

    @GetMapping("/list")
    public List<School_details> school_details_list(){
        List<School_details> all = schoolDetailsService1.findAll();
        System.out.println(all);
        return all;
    }

    @PostMapping("/list")
    public void create(@RequestBody School_details theSchoolDetails){
        schoolDetailsService1.save(theSchoolDetails);
    }
}
