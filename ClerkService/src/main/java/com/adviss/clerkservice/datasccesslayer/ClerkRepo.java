package com.adviss.clerkservice.datasccesslayer;

import com.adviss.clerkservice.clerk.ClerkPojoDBMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClerkRepo extends CrudRepository<ClerkPojoDBMapping,Integer> {
    Optional<ClerkPojoDBMapping> findAllById(int id);
}
