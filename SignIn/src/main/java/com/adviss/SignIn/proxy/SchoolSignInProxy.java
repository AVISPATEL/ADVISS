package com.adviss.SignIn.proxy;

import com.adviss.SignIn.bean.FacultyBean;
import com.adviss.SignIn.bean.SchoolBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("schoolService")
@RibbonClient("schoolService")
public interface SchoolSignInProxy {
    @GetMapping("/schoolDetails/signIn/{emailId}")
    SchoolBean findByEmail(@PathVariable String emailId);
}
