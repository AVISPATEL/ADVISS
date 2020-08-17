package com.adviss.SignIn.validation;

import com.adviss.SignIn.bean.ClerkBean;
import com.adviss.SignIn.bean.FacultyBean;
import com.adviss.SignIn.bean.SchoolBean;
import com.adviss.SignIn.bean.StudentBean;
import org.springframework.stereotype.Service;

@Service
public interface SignInValidatorService {
    ClerkBean clerkValidation(ClerkBean theClerkBean);
    FacultyBean facultyValidation(FacultyBean theFacultyBean);
    SchoolBean schoolValidation(SchoolBean theSchoolBean);
    StudentBean studentValidation(StudentBean theStudentBean);

}
