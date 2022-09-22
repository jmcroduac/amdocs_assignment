package com.training.day6_assignment;

public class Student {
    private String name;
    private String studentId;
    private String college;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    Student(String name, String studentId, String college){
        this.name = name;
        this.studentId = studentId;
        this.college = college;
    }


}
