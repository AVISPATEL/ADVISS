package com.adviss.facultyservice.dataaccesslayer;

import com.adviss.facultyservice.faculty.FacultyPojoDBMapping;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultyRepo extends CrudRepository<FacultyPojoDBMapping,Integer> {
    Optional<FacultyPojoDBMapping> findAllById(int id);
    @Query(value="select * from facultydetails where facultyEmailId=:facultyEmail",nativeQuery=true)
    public FacultyPojoDBMapping findUser(@Param("facultyEmail") String email);
}
