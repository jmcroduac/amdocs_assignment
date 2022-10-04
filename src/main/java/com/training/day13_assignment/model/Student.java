package com.training.day13_assignment.model;

public class Student implements Comparable<Student>{
    private String studId;
    private String studName;
    private String studAddress;
    private String departments;

    public String getStudId() {
        return studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudAddress() {
        return studAddress;
    }

    public void setStudAddress(String studAddress) {
        this.studAddress = studAddress;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    @Override
    public int compareTo(Student o) {
        if(studName.compareTo(o.getStudName()) > 0){
            return 1;
        }else if(studName.compareTo(o.getStudName()) < 0){
            return -1;
        }else{
            return 0;
        }
    }
}
