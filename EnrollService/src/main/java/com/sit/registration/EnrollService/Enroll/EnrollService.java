package com.sit.registration.EnrollService.Enroll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollService {

    @Autowired
    private EnrollRepository enrollRepository;

    public  Enroll enroll(Enroll enroll){
            if(checkIfAvailableToEnroll(enroll)){
                enrollRepository.save(enroll);
                return enroll;
            }    
        return  null;
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
        System.out.print(enrolled);
        List<Long> enrolledSubjectId = new ArrayList<>();
        for (Enroll enroll : enrolled) {
            enrolledSubjectId.add(enroll.getSubjectId());
        }
		return enrolledSubjectId;
	}

	public int getUnavailableSeat(long subjectId) {
		return enrollRepository.countBySubjectId(subjectId);
	}
}
