package com.avi.school_details.dao;

import com.avi.school_details.entity.School_details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface School_repository extends CrudRepository<School_details,Integer> {


    Optional<School_details> findAllById(int id);
}
