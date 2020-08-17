package com.adviss.SignIn.controller;

import com.adviss.SignIn.bean.ClerkBean;
import com.adviss.SignIn.bean.FacultyBean;
import com.adviss.SignIn.bean.SchoolBean;
import com.adviss.SignIn.bean.StudentBean;
import com.adviss.SignIn.proxy.ClerkSignInProxy;
import com.adviss.SignIn.validation.SignInValidator;
import com.adviss.SignIn.validation.SignInValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignInUrlPattern {
    @Autowired
    private SignInValidatorService theService;


    @PostMapping("/SignIn/clerk")
    public ClerkBean findClerk(@RequestBody ClerkBean theClerkBean){
        ClerkBean clerkBean=theService.clerkValidation(theClerkBean);
        return clerkBean;
    }
    @PostMapping("/SignIn/faculty")
    public FacultyBean findFaculty(@RequestBody FacultyBean theFacultyBean){
        FacultyBean facultyBean=theService.facultyValidation(theFacultyBean);
        return facultyBean;
    }
    @PostMapping("/SignIn/school")
    public SchoolBean findSchool(@RequestBody SchoolBean theSchoolBean){
        SchoolBean schoolBean=theService.schoolValidation(theSchoolBean);
        return schoolBean;
    }
    @PostMapping("/SignIn/student")
    public StudentBean findStudent(@RequestBody StudentBean theStudentBean){
        StudentBean studentBean=theService.studentValidation(theStudentBean);
        return studentBean;
    }

}
