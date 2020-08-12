package com.adviss.SignUp.proxy;

import com.adviss.SignUp.bean.ClerkBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "ClerkService")
@RibbonClient(name="ClerkService")
public interface ClerkSignUpProxy {

    @PostMapping("clerkDetails/list")
    public ClerkBean createClerk(@RequestBody ClerkBean theSignUpBean);
}
