package com.adviss.SignIn.proxy;

import com.adviss.SignIn.bean.FacultyBean;
import com.adviss.SignIn.bean.StudentBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("studentService")
@RibbonClient("studentService")
public interface StudentSignInProxy {
    @GetMapping("/studentDetails/signIn/{emailId}")
    StudentBean findByEmail(@PathVariable String emailId);
}

