package com.adviss.studentservice.dataaccesslayer;

import com.adviss.studentservice.student.StudentPojoDBMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends CrudRepository<StudentPojoDBMapping,Integer> {
    Optional<StudentPojoDBMapping> findAllById(int id);

}
