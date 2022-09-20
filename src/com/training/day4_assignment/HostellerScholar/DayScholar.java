package com.training.day4_assignment.HostellerScholar;

public class DayScholar extends Student{

    DayScholar(String name, String registrationNo, String department) {
        super(name, registrationNo, department);
    }

    @Override
    void fetchStudentInfo() {
        super.fetchStudentInfo();
        System.out.println("Student Type: Day Scholar");
        System.out.println();
    }
}
