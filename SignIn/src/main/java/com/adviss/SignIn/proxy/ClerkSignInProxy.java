package com.adviss.SignIn.proxy;

import com.adviss.SignIn.bean.ClerkBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("clerkService")
@RibbonClient("clerkService")
public interface ClerkSignInProxy {
    @GetMapping("/clerkDetails/signIn/{emailId}")
    ClerkBean findByEmail(@PathVariable String emailId);

}
