package com.adviss.SignUp.controller;

import com.adviss.SignUp.bean.FacultyBean;
import com.adviss.SignUp.bean.ClerkBean;
import com.adviss.SignUp.bean.SchoolBean;
import com.adviss.SignUp.bean.StudentBean;
import com.adviss.SignUp.proxy.FacultySignUpProxy;
import com.adviss.SignUp.proxy.ClerkSignUpProxy;
import com.adviss.SignUp.proxy.SchoolSignUpProxy;
import com.adviss.SignUp.proxy.StudentSignUpProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignUpUrlPattern {

    @Autowired
    private ClerkSignUpProxy clerkSignUpProxy;

    @Autowired
    private FacultySignUpProxy facultySignUpProxy;

    @Autowired
    private SchoolSignUpProxy schoolSignUpProxy;

    @Autowired
    private StudentSignUpProxy studentSignUpProxy;

    @PostMapping("/SignUp/clerk")
    public ClerkBean createClerk(@RequestBody ClerkBean theClerkBean){
    return clerkSignUpProxy.createClerk(theClerkBean);
    }

    @PostMapping("/SignUp/faculty")
    public FacultyBean createFaculty(@RequestBody FacultyBean theFacultyBean){
        return facultySignUpProxy.createFaculty(theFacultyBean);
    }

    @PostMapping("/SignUp/school")
    public SchoolBean createSchool(@RequestBody SchoolBean theSchoolBean){
        return schoolSignUpProxy.createSchool(theSchoolBean);
    }

    @PostMapping("/SignUp/student")
    public StudentBean createStudent(@RequestBody StudentBean theStudentBean){
        return studentSignUpProxy.createStudent(theStudentBean);
    }
}
