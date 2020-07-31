package com.avi.clerk_details.controller;

import com.avi.clerk_details.entity.Clerk_details;
import com.avi.clerk_details.service.Clerk_details_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clerk_details")
public class Clerk_details_controller {
    @Autowired
    private Clerk_details_service clerkDetailsService;

    public Clerk_details_controller(Clerk_details_service theClerkDetailsService){
        clerkDetailsService=theClerkDetailsService;
    }

    @GetMapping("/list")
    public List<Clerk_details> clerkDetailsList(){
        List<Clerk_details> all = clerkDetailsService.findAll();
        return all;
    }

    @GetMapping("/list/{id}")
    public Clerk_details clerkDetailsById(@PathVariable int id){
        Clerk_details theClerkDetails = clerkDetailsService.findAll(id);
        if(theClerkDetails==null){
            throw new RuntimeException();
        }
        return theClerkDetails;
    }

    @PostMapping("/list")
    public String createClerk(@RequestBody Clerk_details clerkDetails){
        clerkDetailsService.save(clerkDetails);
        return "created sucessfully";
    }

    @PutMapping("/list")
    public String updateClerk(@RequestBody Clerk_details clerkDetails){
        clerkDetailsService.save(clerkDetails);
        return "updated sucessfully";
    }

    @DeleteMapping("/list/{id}")
    public String deleteClerk(@PathVariable int id){
        clerkDetailsService.deleteById(id);
        return "delete sucessfully";
    }
}
