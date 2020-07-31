package com.avi.faculty_details.dao;

import com.avi.faculty_details.entity.Faculty_details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Faculty_repository extends CrudRepository<Faculty_details,Integer> {
    Optional<Faculty_details> findAllById(int id);
}
