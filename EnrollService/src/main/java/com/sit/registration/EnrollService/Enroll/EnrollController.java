package com.sit.registration.EnrollService.Enroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollController {
    
    @Autowired
    private EnrollService enrollService;

    @PostMapping("/enroll")
    public @ResponseBody ResponseEntity<List<Enroll>> enrollSubjects(@RequestBody List<Enroll> enrolls){
        return new ResponseEntity<>(enrollService.enroll(enrolls), HttpStatus.OK);
    } 
    
}
