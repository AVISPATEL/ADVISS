package com.adviss.facultyservice.controller;

import com.adviss.facultyservice.faculty.FacultyPojoDBMapping;
import com.adviss.facultyservice.service.FacultyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facultyDetails")
public class FacultyServiceUrlPattern {
    @Autowired
    private FacultyServiceInterface facultyDetailsService;

    public FacultyServiceUrlPattern(FacultyServiceInterface theFacultyDetailsService){
        facultyDetailsService=theFacultyDetailsService;
    }

    @GetMapping("/list")
    public List<FacultyPojoDBMapping> facultyDetailsList(){
        List<FacultyPojoDBMapping> all = facultyDetailsService.findAll();
        return all;
    }

    @GetMapping("/list/{id}")
    public FacultyPojoDBMapping facultyDetailsById(@PathVariable int id){
        FacultyPojoDBMapping theFacultyDetails = facultyDetailsService.findAll(id);
        if(theFacultyDetails==null){
            throw new RuntimeException();
        }
        return theFacultyDetails;
    }

    @PostMapping("/list")
    public String createFaculty(@RequestBody FacultyPojoDBMapping facultyDetails){
        facultyDetailsService.save(facultyDetails);
        return "created sucessfully";
    }

    @PutMapping("/list")
    public String updateFaculty(@RequestBody FacultyPojoDBMapping facultyDetails){
        facultyDetailsService.save(facultyDetails);
        return "updated sucessfully";
    }

    @DeleteMapping("/list/{id}")
    public String deleteFaculty(@PathVariable int id){
        facultyDetailsService.deleteById(id);
        return "delete sucessfully";
    }
}
