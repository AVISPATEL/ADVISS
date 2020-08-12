package com.adviss.SignUp.proxy;

import com.adviss.SignUp.bean.SchoolBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("SchoolService")
@RibbonClient("SchoolService")
public interface SchoolSignUpProxy {
    @PostMapping("/schoolDetails/list")
    SchoolBean createSchool(@RequestBody SchoolBean theSchoolBean);
}
