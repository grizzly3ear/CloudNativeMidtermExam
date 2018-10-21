package com.sit.registration.SubjectService.Subject;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService{

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAll(){
        return subjectRepository.findAll();
    }
    
    public Subject getOne(long id){
        return subjectRepository.getOne(id);
    }
}