package com.avi.student_details.controller;

import com.avi.student_details.entity.Student_details;
import com.avi.student_details.service.Student_details_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student_details")
public class Student_details_controller {
    @Autowired
    private Student_details_service studentDetailsService;

    public Student_details_controller(Student_details_service theStudentDetailsService){
        studentDetailsService=theStudentDetailsService;
    }

    @GetMapping("/list")
    public List<Student_details> studentDetailsList(){
        List<Student_details> all = studentDetailsService.findAll();
        return all;
    }

    @GetMapping("/list/{id}")
    public Student_details studenntFindById(@PathVariable int id){
        Student_details theStudentdetails = studentDetailsService.findAll(id);
        if(theStudentdetails==null){
            throw new RuntimeException();
        }
        return theStudentdetails;
    }

    @PostMapping("/list")
    public String createStudent(@RequestBody Student_details theStudentDetails){
        studentDetailsService.save(theStudentDetails);
        return "created sucessfully";
    }

    @PutMapping("/list")
    public String updateStudent(@RequestBody Student_details theStudentDetails){
        studentDetailsService.save(theStudentDetails);
        return "updated sucessfully";
    }

    @DeleteMapping("/list/{id}")
    public String deleteStudent(@PathVariable int id){
        Student_details theStudentDetails = studentDetailsService.findAll(id);
        if(theStudentDetails==null){
            throw new RuntimeException();
        }
        return "Deleted sucessfully";
    }

}
