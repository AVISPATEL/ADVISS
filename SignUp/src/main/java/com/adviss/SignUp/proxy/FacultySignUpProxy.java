package com.adviss.SignUp.proxy;

import com.adviss.SignUp.bean.FacultyBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="FacultyService")
@RibbonClient(name="FacultyService")
public interface FacultySignUpProxy {
    @PostMapping("/facultyDetails/list")
    FacultyBean createFaculty(@RequestBody FacultyBean theFacultyBean);
}
