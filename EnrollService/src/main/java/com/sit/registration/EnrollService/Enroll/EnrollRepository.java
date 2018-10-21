package com.sit.registration.EnrollService.Enroll;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollRepository extends JpaRepository<Enroll, Long>{
    public int countByStudentId(long studentId);

	public List<Enroll> findByStudentId(long studentId);

	public int countBySubjectId(long subjectId);
}