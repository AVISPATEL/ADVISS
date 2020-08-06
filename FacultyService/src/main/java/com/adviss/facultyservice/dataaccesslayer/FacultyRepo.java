package com.adviss.facultyservice.dataaccesslayer;

import com.adviss.facultyservice.faculty.FacultyPojoDBMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultyRepo extends CrudRepository<FacultyPojoDBMapping,Integer> {
    Optional<FacultyPojoDBMapping> findAllById(int id);
}
