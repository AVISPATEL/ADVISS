package com.adviss.studentservice.dataaccesslayer;

import com.adviss.studentservice.student.StudentPojoDBMapping;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends CrudRepository<StudentPojoDBMapping,Integer> {
    Optional<StudentPojoDBMapping> findAllById(int id);
    @Query(value="select * from studentdetails where studentEmailId=:studentEmail",nativeQuery=true)
    public List<StudentPojoDBMapping> findUser(@Param("studentEmail") String email);
}
