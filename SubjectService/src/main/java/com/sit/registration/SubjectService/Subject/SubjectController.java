package com.sit.registration.SubjectService.Subject;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SubjectController{

    @Autowired
    private SubjectService subjectService;
    
    @GetMapping("/subjects")
    public ResponseEntity<List<Subject>> getAllSubject(){
        return new ResponseEntity<>(subjectService.getAll(), HttpStatus.OK);
    }
    
    @GetMapping("/subject/{studentId}")
    public ResponseEntity<List<Subject>> getAllSubjectThatAvailableForUser(@PathVariable long studentId){
        return new ResponseEntity<>(subjectService.getSubjectThatUserCanEnroll(studentId), HttpStatus.OK);
    }

}