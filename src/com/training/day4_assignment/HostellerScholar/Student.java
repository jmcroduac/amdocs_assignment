package com.training.day4_assignment.HostellerScholar;

public class Student {
    String name;
    String registrationNo;
    String department;

    Student(String name, String registrationNo, String department){
        this.name = name;
        this.registrationNo = registrationNo;
        this.department = department;
    }

    void fetchStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + registrationNo);
        System.out.println("Department: " + department);
    }
}
