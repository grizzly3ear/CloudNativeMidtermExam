package com.sit.registration.EnrollService.Enroll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollService {

    @Autowired
    private EnrollRepository enrollRepository;

    public  List<Enroll> enroll(List<Enroll> enrolls){
        List<Enroll> enrolled = new ArrayList<>();
        for (Enroll enroll : enrolls) {
            if(checkIfAvailableToEnroll(enroll)){
                enrolled.add(enroll);
                enrollRepository.save(enroll);
            }    
        }
        return enrolled;
    }

    public boolean checkIfAvailableToEnroll(Enroll enroll){
        int year = enroll.getYear();
        int alreadyEnroll = enrollRepository.countByStudentId(enroll.getStudentId());
        if(year == 3 && alreadyEnroll < 2){
            return true;
        }else if(year == 4 && alreadyEnroll < 1){
            return true;
        }else{
            return false;
        }
    }

	public List<Long> getEnrolledSubject(long studentId) {
        List<Enroll> enrolled = enrollRepository.findByStudentId(studentId);
        List<Long> enrolledSubjectId = new ArrayList<>();
        for (Enroll enroll : enrolled) {
            enrolledSubjectId.add(enroll.getSubjectId());
        }
		return enrolledSubjectId;
	}
}
