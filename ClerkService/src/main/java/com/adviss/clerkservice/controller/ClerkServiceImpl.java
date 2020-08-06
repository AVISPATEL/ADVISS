package com.adviss.clerkservice.controller;

import com.adviss.clerkservice.datasccesslayer.ClerkRepo;
import com.adviss.clerkservice.clerk.ClerkPojoDBMapping;
import com.adviss.clerkservice.service.ClerkServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class ClerkServiceImpl implements ClerkServiceInterface {
    @Autowired
    private ClerkRepo clerkRepository;

    public ClerkServiceImpl(ClerkRepo theClerkRepository){
        clerkRepository=theClerkRepository;
    }
    @Override
    public List<ClerkPojoDBMapping> findAll() {
        return (List<ClerkPojoDBMapping>) clerkRepository.findAll();
    }

    @Override
    public ClerkPojoDBMapping findAll(int id) {
        Optional<ClerkPojoDBMapping> allById = clerkRepository.findAllById(id);
        if(allById.isPresent()){
            return allById.get();
        }
        return null;
    }

    @Override
    public void save(ClerkPojoDBMapping theClerkDetails) {
        clerkRepository.save(theClerkDetails);
    }

    @Override
    public void deleteById(int id) {
        clerkRepository.deleteById(id);
    }
}
