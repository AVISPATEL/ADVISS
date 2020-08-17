package com.adviss.schoolservice.dataaccesslayer;

import com.adviss.schoolservice.school.SchoolPojoDBMapping;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchoolRepo extends CrudRepository<SchoolPojoDBMapping,Integer> {
    Optional<SchoolPojoDBMapping> findAllById(int id);
    @Query(value="select * from schooldetails where schoolEmailId=:schoolEmail",nativeQuery=true)
    public SchoolPojoDBMapping findUser(@Param("schoolEmail") String email);
}
