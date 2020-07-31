package com.avi.faculty_details.controller;

import com.avi.faculty_details.entity.Faculty_details;
import com.avi.faculty_details.service.Faculty_details_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty_details")
public class Faculty_details_controller {
    @Autowired
    private Faculty_details_service facultyDetailsService;

    public Faculty_details_controller(Faculty_details_service theFacultyDetailsService){
        facultyDetailsService=theFacultyDetailsService;
    }

    @GetMapping("/list")
    public List<Faculty_details> facultyDetailsList(){
        List<Faculty_details> all = facultyDetailsService.findAll();
        return all;
    }

    @GetMapping("/list/{id}")
    public Faculty_details facultyDetailsById(@PathVariable int id){
        Faculty_details theFacultyDetails = facultyDetailsService.findAll(id);
        if(theFacultyDetails==null){
            throw new RuntimeException();
        }
        return theFacultyDetails;
    }

    @PostMapping("/list")
    public String createFaculty(@RequestBody Faculty_details facultyDetails){
        facultyDetailsService.save(facultyDetails);
        return "created sucessfully";
    }

    @PutMapping("/list")
    public String updateFaculty(@RequestBody Faculty_details facultyDetails){
        facultyDetailsService.save(facultyDetails);
        return "updated sucessfully";
    }

    @DeleteMapping("/list/{id}")
    public String deleteFaculty(@PathVariable int id){
        facultyDetailsService.deleteById(id);
        return "delete sucessfully";
    }
}
