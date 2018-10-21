package com.sit.registration.EnrollService.Enroll;

import java.io.Serializable;

public class Enroll implements Serializable{
    private long id;
    private long studentId;
    private long courseId;

    public long getId() {
        return id;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
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