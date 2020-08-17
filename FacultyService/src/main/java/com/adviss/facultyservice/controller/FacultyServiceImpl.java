package com.adviss.facultyservice.controller;

import com.adviss.facultyservice.faculty.FacultyPojoDBMapping;
import com.adviss.facultyservice.service.FacultyServiceInterface;
import com.adviss.facultyservice.dataaccesslayer.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class FacultyServiceImpl implements FacultyServiceInterface {

    @Autowired
    private FacultyRepo facultyRepository;

    public FacultyServiceImpl(FacultyRepo theFacultyRepository){
        facultyRepository=theFacultyRepository;
    }
    @Override
    public List<FacultyPojoDBMapping> findAll() {
        return (List<FacultyPojoDBMapping>) facultyRepository.findAll();
    }

    @Override
    public FacultyPojoDBMapping findAll(int id) {
        Optional<FacultyPojoDBMapping> allById = facultyRepository.findAllById(id);
        if(allById.isPresent()){
            return allById.get();
        }
        return null;
    }

    @Override
    public void save(FacultyPojoDBMapping theFacultyDetails) {
        facultyRepository.save(theFacultyDetails);
    }

    @Override
    public void deleteById(int id) {
        facultyRepository.deleteById(id);
    }

    @Override
    public int findUser(String emailId) {
        FacultyPojoDBMapping theFaculty=facultyRepository.findUser(emailId);
        return theFaculty.getId();

    }
}
