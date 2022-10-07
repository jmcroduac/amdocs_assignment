package com.training.day14_assignment;

import javax.persistence.*;

@Entity
@Table(name="Student_Table")
public class Student {
    @Id
    @Column(name="student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Column(name="student_name")
    private String studentName;

    @Column(name="student_grade")
    private String grade;

    public Student(String studentName, String grade) {
        super();
        this.studentName = studentName;
        this.grade = grade;
    }

    public Student(){
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
