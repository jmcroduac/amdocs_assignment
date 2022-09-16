package com.training.assignment1;

public class Student {
    String name;
    int age;
    int rollNo;
    int marks;

    public Student(String name, int age, int rollNo, int marks){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;

        if(marks < 30){
            System.out.println("Student " + this.name +" cannot be initialized. Marks less than 30 cannot be accepted.");
        }else{
            this.marks = marks;
            System.out.println("Student " + this.name + " is initialized.");
        }
    }
}
