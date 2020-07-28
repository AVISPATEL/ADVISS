package com.avi.school_details.dao;

import com.avi.school_details.entity.School_details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface School_repository extends CrudRepository<School_details,Integer> {

    School_details findAllById(int id);


}
