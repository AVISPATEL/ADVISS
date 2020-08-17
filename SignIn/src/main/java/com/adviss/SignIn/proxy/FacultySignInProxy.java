package com.adviss.SignIn.proxy;

import com.adviss.SignIn.bean.FacultyBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("facultyService")
@RibbonClient("facultyService")
public interface FacultySignInProxy {
    @GetMapping("/facultyDetails/signIn/{emailId}")
    FacultyBean findByEmail(@PathVariable String emailId);
}
