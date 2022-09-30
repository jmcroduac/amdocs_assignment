package com.training.day11_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Diana",'A'));
        students.add(new Student("Elizabeth",'A'));
        students.add(new Student("Philip",'B'));
        students.add(new Student("William",'C'));
        students.add(new Student("Kate",'A'));

        ArrayList<Student> filteredList = new ArrayList<>();

        for (Student s: students) {
            if(Character.compare(s.getGpa(),'A') == 0){
                filteredList.add(s);
            }
        }

        Collections.sort(filteredList,(p1,p2)->{
            return p1.getName().compareTo(p2.getName());
        });
        for(Student s : filteredList){
            System.out.println("Name: " + s.getName() + " GPA: " + s.getGpa());
        }

    }
}
