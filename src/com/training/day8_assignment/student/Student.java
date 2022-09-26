package com.training.day8_assignment.student;

public class Student {
    private String name;
    private int studentNo;
    private int age;

    Student(int studentNo, String name, int age){
        this.name = name;
        this.studentNo = studentNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentNo + "\nName: " + name + "\nAge: " + age + "\n";
    }
}
