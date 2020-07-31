package com.avi.clerk_details.service;

import com.avi.clerk_details.entity.Clerk_details;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Clerk_details_service {
    List<Clerk_details> findAll();

    Clerk_details findAll(int id);

    void save(Clerk_details theFacultyDetails);

    void deleteById(int id);
}
