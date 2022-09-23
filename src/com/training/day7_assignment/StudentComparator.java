package com.training.day7_assignment;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.enrollmentId < o2.enrollmentId){
            return -1;
        }else if(o1.enrollmentId > o2.enrollmentId){
            return 1;
        }else {
            return 0;
        }
    }
}
