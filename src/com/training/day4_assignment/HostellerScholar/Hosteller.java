package com.training.day4_assignment.HostellerScholar;

public class Hosteller extends Student{

    String hostelNo;
    String roomNumber;

    Hosteller(String name, String registrationNo, String department, String hostelNo, String roomNumber) {
        super(name, registrationNo, department);
        this.hostelNo = hostelNo;
        this.roomNumber = roomNumber;
    }

    @Override
    void fetchStudentInfo() {
        super.fetchStudentInfo();
        System.out.println("Student Type: Hosteller");
        System.out.println("Hostel Number: " + hostelNo);
        System.out.println("Room Number: " + roomNumber);
        System.out.println();
    }
}
