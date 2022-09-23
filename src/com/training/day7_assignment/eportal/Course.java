package com.training.day7_assignment.eportal;

import java.util.ArrayList;
import java.util.Collections;

public class Course {
    String name;
    int duration;
    ArrayList<Student> classList = new ArrayList<>();

    Course(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    public void addStudent(Student student){
        classList.add(student);
    }

    public void printDetails(){
        System.out.println("Course ID: " + name);
        System.out.println("Course duration: " + duration + " weeks");
    }

    public void printClassList(){
        System.out.println("The students enrolled to " + name + " are:");

        Collections.sort(classList, new StudentComparator());

        for (Student student : classList) {
            System.out.println("Name: " + student.name + " Enrollment ID: " + student.enrollmentId);
        }
    }
}
