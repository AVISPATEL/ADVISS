package com.adviss.SignIn.validation;


import com.adviss.SignIn.bean.ClerkBean;
import com.adviss.SignIn.bean.FacultyBean;
import com.adviss.SignIn.bean.SchoolBean;
import com.adviss.SignIn.bean.StudentBean;
import com.adviss.SignIn.proxy.ClerkSignInProxy;
import com.adviss.SignIn.proxy.FacultySignInProxy;
import com.adviss.SignIn.proxy.SchoolSignInProxy;
import com.adviss.SignIn.proxy.StudentSignInProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInValidator implements SignInValidatorService{

    @Autowired
    private ClerkSignInProxy clerkProxy;

    @Autowired
    private FacultySignInProxy facultyProxy;

    @Autowired
    private SchoolSignInProxy schoolProxy;

    @Autowired
    private StudentSignInProxy studentProxy;

    public ClerkBean clerkValidation(ClerkBean theClerkBean) {
        ClerkBean clerkBean = clerkProxy.findByEmail(theClerkBean.getClerkEmailId());
        if (clerkBean != null) {
            if (clerkBean.getClerkAadharNo() == theClerkBean.getClerkAadharNo()) {
                return clerkBean;
            }
        }
        return null;
    }

    @Override
    public FacultyBean facultyValidation(FacultyBean theFacultyBean) {
        FacultyBean facultyBean=facultyProxy.findByEmail(theFacultyBean.getFacultyEmailId());
        if(facultyBean!=null){
            if(facultyBean.getFacultyAadharNo()==theFacultyBean.getFacultyAadharNo()){
                return facultyBean;
            }
        }
        return null;
    }

    @Override
    public SchoolBean schoolValidation(SchoolBean theSchoolBean) {
        SchoolBean schoolBean=schoolProxy.findByEmail(theSchoolBean.getSchoolEmailId());
        if(schoolBean!=null){
            if(schoolBean.getAadharNo()==theSchoolBean.getAadharNo()){
                return schoolBean;
            }
        }
        return  null;
    }

    @Override
    public StudentBean studentValidation(StudentBean theStudentBean) {
        StudentBean studentBean=studentProxy.findByEmail(theStudentBean.getStudentEmailId());
        if(studentBean!=null){
            if(studentBean.getStudentAadharNo()==theStudentBean.getStudentAadharNo()){
                return studentBean;
            }
        }
        return null;
    }

}
