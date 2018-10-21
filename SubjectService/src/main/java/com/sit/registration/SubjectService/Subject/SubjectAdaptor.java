package com.sit.registration.SubjectService.Subject;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SubjectAdaptor {

    public Long[] getEnrolledSubjectId(long studentId){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/enrolled/"+studentId;
        Long[] enrolledSubjectId = restTemplate.getForObject(url, Long[].class);
        return enrolledSubjectId;
    }

    public int getYear(long studentId){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8100/user/"+studentId+"/year";
        int year = restTemplate.getForObject(url, Integer.class);
        return year;
    }

	public int getUnAvailableSeat(long subjectId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/seat/"+subjectId+"/unavailable";
        int seat = restTemplate.getForObject(url, Integer.class);
		return seat;
	}
}
