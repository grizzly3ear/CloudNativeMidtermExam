package com.sit.registration.EnrollService.Enroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollController {
    
    @Autowired
    private EnrollService enrollService;
    
}
