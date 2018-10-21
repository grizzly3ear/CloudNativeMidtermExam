package com.sit.registration.EnrollService.Enroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollRepository extends JpaRepository<Enroll, Long>{
    public int countByStudentId(long studentId);
}