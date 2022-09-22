package com.training.day6_assignment;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student("Taylor","001","Humanities"));
        arr.add(new Student("Dua","002","Engineering"));
        arr.add(new Student("Cardi","003","Nursing"));
        arr.add(new Student("Selena","004","Law"));
        arr.add(new Student("Doja","005","Humanities"));
        arr.add(new Student("Lisa","006","Engineering"));

        ArrayList<Student> result = studentsInCollege(arr,"Humanities");

        for(Student s : result){
            System.out.println("Name: " + s.getName() + " Student ID: " + s.getStudentId());
        }

    }

    public static ArrayList<Student> studentsInCollege(ArrayList<Student> arr, String college){
        ArrayList<Student> result = new ArrayList<>();
        for(Student s : arr){
            if(s.getCollege().equals(college)){
                result.add(s);
            }
        }
        return result;
    }
}
