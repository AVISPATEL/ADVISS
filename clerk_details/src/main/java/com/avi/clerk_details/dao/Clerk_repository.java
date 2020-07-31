package com.avi.clerk_details.dao;

import com.avi.clerk_details.entity.Clerk_details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Clerk_repository extends CrudRepository<Clerk_details,Integer> {
    Optional<Clerk_details> findAllById(int id);
}
