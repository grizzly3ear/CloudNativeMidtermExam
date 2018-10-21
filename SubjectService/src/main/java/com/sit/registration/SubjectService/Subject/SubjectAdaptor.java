package com.sit.registration.SubjectService.Subject;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SubjectAdaptor {

    public Long[] getEnrolledSubjectId(long studentId){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://enrollservice-timely-emu.mybluemix.net/enrolled/"+studentId;
        Long[] enrolledSubjectId = restTemplate.getForObject(url, Long[].class);
        return enrolledSubjectId;
    }

    public int getYear(long studentId){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://userservice-forgiving-nyala.mybluemix.net/user/"+studentId+"/year";
        int year = restTemplate.getForObject(url, Integer.class);
        return year;
    }

	public int getUnAvailableSeat(long subjectId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://enrollservice-timely-emu.mybluemix.net/seat/"+subjectId+"/unavailable";
        int seat = restTemplate.getForObject(url, Integer.class);
		return seat;
	}
}
