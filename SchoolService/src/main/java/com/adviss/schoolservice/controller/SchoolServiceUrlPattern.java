package com.adviss.schoolservice.controller;

import com.adviss.schoolservice.service.SchoolServiceInterface;
import com.adviss.schoolservice.school.SchoolPojoDBMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/schoolDetails")
public class SchoolServiceUrlPattern {

    @Autowired
    private SchoolServiceInterface schoolDetailsService1;



    public SchoolServiceUrlPattern(SchoolServiceInterface theSchoolDetailsService1){
        schoolDetailsService1=theSchoolDetailsService1;
    }

    @GetMapping("/list")
    public List<SchoolPojoDBMapping> schoolDetailsList(){
        List<SchoolPojoDBMapping> all = schoolDetailsService1.findAll();
        return all;
    }

    @GetMapping("/list/{id}")
    public SchoolPojoDBMapping findbyId(@PathVariable int id){
        SchoolPojoDBMapping theSchoolDetails=schoolDetailsService1.findAll(id);
        if(theSchoolDetails==null) {
            throw new RuntimeException();
        }
        return theSchoolDetails;
    }

    @PostMapping("/list")
    public String create(@RequestBody SchoolPojoDBMapping theSchoolDetails){
        schoolDetailsService1.save(theSchoolDetails);
        return "created sucessfully";
    }

    @PutMapping("/list")
    public String update(@RequestBody SchoolPojoDBMapping theSchoolDetails){
        schoolDetailsService1.save(theSchoolDetails);
        return "updated sucessfully";
    }

    @DeleteMapping("/list/{id}")
    public String delete(@PathVariable int id){
        SchoolPojoDBMapping theSchoolDetails=schoolDetailsService1.findAll(id);
        if(theSchoolDetails==null){
            throw new RuntimeException();
        }
        schoolDetailsService1.deleteById(id);
        return "Deleted sucessfully";
    }

}
