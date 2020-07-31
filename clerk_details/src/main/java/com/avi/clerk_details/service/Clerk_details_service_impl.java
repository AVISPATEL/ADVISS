package com.avi.clerk_details.service;

import com.avi.clerk_details.dao.Clerk_repository;
import com.avi.clerk_details.entity.Clerk_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class Clerk_details_service_impl implements Clerk_details_service {
    @Autowired
    private Clerk_repository clerkRepository;

    public Clerk_details_service_impl(Clerk_repository theClerkRepository){
        clerkRepository=theClerkRepository;
    }
    @Override
    public List<Clerk_details> findAll() {
        return (List<Clerk_details>) clerkRepository.findAll();
    }

    @Override
    public Clerk_details findAll(int id) {
        Optional<Clerk_details> allById = clerkRepository.findAllById(id);
        if(allById.isPresent()){
            return allById.get();
        }
        return null;
    }

    @Override
    public void save(Clerk_details theClerkDetails) {
        clerkRepository.save(theClerkDetails);
    }

    @Override
    public void deleteById(int id) {
        clerkRepository.deleteById(id);
    }
}
