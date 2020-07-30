package com.avi.student_details.dao;

import com.avi.student_details.entity.Student_details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Student_repository extends CrudRepository<Student_details,Integer> {
    Optional<Student_details> findAllById(int id);

}
