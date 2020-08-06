package com.adviss.schoolservice.dataaccesslayer;

import com.adviss.schoolservice.school.SchoolPojoDBMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchoolRepo extends CrudRepository<SchoolPojoDBMapping,Integer> {
    Optional<SchoolPojoDBMapping> findAllById(int id);
}
