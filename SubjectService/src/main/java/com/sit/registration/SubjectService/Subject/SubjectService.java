package com.sit.registration.SubjectService.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService{

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private SubjectAdaptor subjectAdaptor;
    

    

    public List<Subject> getAll(){
        return subjectRepository.findAll();
    }
    
    public Subject getOne(long id){
        return subjectRepository.getOne(id);
    }

    public List<Subject> getSubjectThatUserCanEnroll(long studentId){
        List<Long> enrolledSubjectId = Arrays.asList(subjectAdaptor.getEnrolledSubjectId(studentId));
        List<Subject> allSubject = subjectRepository.findAll();
        int year = subjectAdaptor.getYear(studentId);
        int numberOfEnroll = 0;
        for (long subjectId : enrolledSubjectId) {
            Subject enrolled = subjectRepository.getOne(subjectId);
            if(allSubject.contains(enrolled)){
                allSubject.remove(enrolled);
                numberOfEnroll++;
            }
        }
        if(year < 3){
            allSubject.clear();
        }else if(year == 3 && numberOfEnroll > 1){
            allSubject.clear();
        }else if(year == 4 && numberOfEnroll > 0){
            allSubject.clear();
        }
        return allSubject;
    }

}