package com.sit.registration.EnrollService.Enroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*", maxAge=3600)
public class EnrollController {
    
    @Autowired
    private EnrollService enrollService;

    @PostMapping("/enroll")
    public ResponseEntity<Enroll> enrollSubjects(@RequestBody Enroll enroll){
        return new ResponseEntity<>(enrollService.enroll(enroll), HttpStatus.OK);
    } 

    @GetMapping("/enrolled/{studentId}")
    public ResponseEntity<List<Long>> getEnrolledSubjectId(@PathVariable long studentId){
        return new ResponseEntity<>(enrollService.getEnrolledSubject(studentId), HttpStatus.OK);
    }

    @GetMapping("/seat/{subjectId}/unavailable")
    public ResponseEntity<Integer> getUnavailableSeat(@PathVariable long subjectId){
        return new ResponseEntity<>(enrollService.getUnavailableSeat(subjectId), HttpStatus.OK);
    }
    
}
