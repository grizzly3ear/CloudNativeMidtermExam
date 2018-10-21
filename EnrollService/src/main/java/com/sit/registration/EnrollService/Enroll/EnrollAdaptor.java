package com.sit.registration.EnrollService.Enroll;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnrollAdaptor {
    
    public boolean enroll(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "";
        if(checkIfAvailable(0, 0)){
            
        }
        return true;
    }
    
    public boolean checkIfAvailable(long studentId, long subjectId){
        RestTemplate restTemplate = new RestTemplate();
        String url = "";
        
        return true;
    }
}
