package com.adviss.clerkservice.service;

import com.adviss.clerkservice.clerk.ClerkPojoDBMapping;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClerkServiceInterface {
    List<ClerkPojoDBMapping> findAll();

    ClerkPojoDBMapping findAll(int id);

    void save(ClerkPojoDBMapping theFacultyDetails);

    void deleteById(int id);

    int findUser(String emailId);


}
