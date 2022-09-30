package com.training.day11_assignment;

public class Student {
    String name;
    char gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGpa() {
        return gpa;
    }

    public void setGpa(char gpa) {
        this.gpa = gpa;
    }

    Student(String name, char gpa){
        this.name = name;
        this.gpa = gpa;
    }
}
