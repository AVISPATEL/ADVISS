package com.adviss.clerkservice.datasccesslayer;

import com.adviss.clerkservice.clerk.ClerkPojoDBMapping;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClerkRepo extends CrudRepository<ClerkPojoDBMapping,Integer> {
    Optional<ClerkPojoDBMapping> findAllById(int id);
 

    @Query(value="select * from clerkdetails where clerkEmailId=:clerkEmail",nativeQuery=true)
    public ClerkPojoDBMapping findUser(@Param("clerkEmail") String email);
}
