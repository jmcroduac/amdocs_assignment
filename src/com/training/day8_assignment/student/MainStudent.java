package com.training.day8_assignment.student;

import java.util.Map;
import java.util.TreeMap;

public class MainStudent {
    public static void main(String[] args) {
        Map<Integer,Student> studentMap = new TreeMap<>();
        studentMap.put(101, new Student(101,"John",23));
        studentMap.put(103, new Student(103,"Shiela",22));
        studentMap.put(104, new Student(104,"Lei",23));
        studentMap.put(102, new Student(102,"Sarah",21));
        studentMap.put(105, new Student(105,"Serena",23));

        for(int n1 : studentMap.keySet()){
            Student stud = studentMap.get(n1);

            if(stud.getName().startsWith("S") || stud.getName().startsWith("s")){
                System.out.println((stud.toString()));
            }
        }
    }
}
