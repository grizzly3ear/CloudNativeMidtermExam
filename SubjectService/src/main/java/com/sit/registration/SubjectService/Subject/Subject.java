package com.sit.registration.SubjectService.Subject;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="subjects")
public class Subject implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String courseCode;

    @NotBlank
    private String courseName;

    @NotBlank
    private String lecturer;

    @NotBlank
    private int seat;

    public long getId() {
        return id;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setId(long id) {
        this.id = id;
    }
}