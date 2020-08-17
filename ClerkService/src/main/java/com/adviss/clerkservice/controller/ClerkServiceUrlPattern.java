package com.adviss.clerkservice.controller;

import com.adviss.clerkservice.clerk.ClerkPojoDBMapping;
import com.adviss.clerkservice.service.ClerkServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clerkDetails")
public class ClerkServiceUrlPattern {
    @Autowired
    private ClerkServiceInterface clerkDetailsService;
    ClerkPojoDBMapping theClerk;
    public ClerkServiceUrlPattern(ClerkServiceInterface theClerkDetailsService){
        clerkDetailsService=theClerkDetailsService;
    }

    @GetMapping("/list")
    public List<ClerkPojoDBMapping> clerkDetailsList(){
        List<ClerkPojoDBMapping> all = clerkDetailsService.findAll();
        return all;
    }

    @GetMapping("/list/{id}")
    public ClerkPojoDBMapping clerkDetailsById(@PathVariable int id){
        ClerkPojoDBMapping theClerkDetails = clerkDetailsService.findAll(id);
        if(theClerkDetails==null){
            throw new RuntimeException();
        }
        return theClerkDetails;
    }

    @PostMapping("/list")
    public String createClerk(@RequestBody ClerkPojoDBMapping clerkDetails){
        clerkDetailsService.save(clerkDetails);
        return "created sucessfully";
    }

    @PutMapping("/list")
    public String updateClerk(@RequestBody ClerkPojoDBMapping clerkDetails){
        clerkDetailsService.save(clerkDetails);
        return "updated sucessfully";
    }

    @DeleteMapping("/list/{id}")
    public String deleteClerk(@PathVariable int id){
        clerkDetailsService.deleteById(id);
        return "delete sucessfully";
    }
    @GetMapping("/signIn/{emailId}")
    public ClerkPojoDBMapping findByEmail(@PathVariable(value = "emailId") String emailId){
        int findClerk=clerkDetailsService.findUser(emailId);
        theClerk=clerkDetailsService.findAll(findClerk);
        return theClerk;
    }

}
