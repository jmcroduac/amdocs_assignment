package com.training.day4_assignment.HostellerScholar;

public class StudentDriverClass {
    public static void main(String[] args){
        Student s1 = new DayScholar("Taylor","001","Arts");
        Student s2 = new Hosteller("Selena","002","Math","10","2");

        s1.fetchStudentInfo();
        s2.fetchStudentInfo();
    }
}
