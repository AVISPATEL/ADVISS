package com.adviss.studentservice.controller;

import com.adviss.studentservice.student.StudentPojoDBMapping;
import com.adviss.studentservice.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentDetails")
public class StudentServiceUrlPattern {
    @Autowired
    private StudentServiceInterface studentDetailsService;

    public StudentServiceUrlPattern(StudentServiceInterface theStudentDetailsService){
        studentDetailsService=theStudentDetailsService;
    }

    @GetMapping("/list")
    public List<StudentPojoDBMapping> studentDetailsList(){
        List<StudentPojoDBMapping> all = studentDetailsService.findAll();
        return all;
    }

    @GetMapping("/list/{id}")
    public StudentPojoDBMapping studenntFindById(@PathVariable int id){
        StudentPojoDBMapping theStudentdetails = studentDetailsService.findAll(id);
        if(theStudentdetails==null){
            throw new RuntimeException();
        }
        return theStudentdetails;
    }

    @PostMapping("/list")
    public String createStudent(@RequestBody StudentPojoDBMapping theStudentDetails){
        studentDetailsService.save(theStudentDetails);
        return "created sucessfully";
    }

    @PutMapping("/list")
    public String updateStudent(@RequestBody StudentPojoDBMapping theStudentDetails){
        studentDetailsService.save(theStudentDetails);
        return "updated sucessfully";
    }

    @DeleteMapping("/list/{id}")
    public String deleteStudent(@PathVariable int id) {
        StudentPojoDBMapping theStudentDetails = studentDetailsService.findAll(id);
        if (theStudentDetails == null) {
            throw new RuntimeException();
        }
        return "Deleted sucessfully";
    }

    @GetMapping("/signIn/{emailId}")
    public StudentPojoDBMapping findByEmail(@PathVariable(value = "emailId") String emailId){
        int findStudent=studentDetailsService.findUser(emailId);
        StudentPojoDBMapping theStudent=studentDetailsService.findAll(findStudent);
        return theStudent;
    }

}
