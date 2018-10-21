package com.sit.registration.EnrollService.Enroll;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="enrolls")
public class Enroll implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @NotNull
    private long studentId;

    @NotNull
    private long subjectId;

    @NotNull
    private int year;

    Enroll(){
        super();
    }
    Enroll(long studentId, long subjectId, int year){
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setId(long id) {
        this.id = id;
    }

}