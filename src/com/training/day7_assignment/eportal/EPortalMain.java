package com.training.day7_assignment.eportal;

import java.util.*;

public class EPortalMain {
    public static void main(String[] args) {
        String ans = "yes";

        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Course> courseList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(ans.equals("yes")){
            System.out.println("E-Learning Portal Menu:");
            System.out.println("1. Add new course");
            System.out.println("2. Add new student");
            System.out.println("3. Enroll student to a course");
            System.out.println("4. View details of course");
            System.out.println("5. View students enrolled in a course");
            System.out.println("Enter number of the action you want to do: ");

            try{
                int num = scanner.nextInt();

                if(num == 1){
                    System.out.print("Enter course name: ");
                    String course = scanner.next();
                    System.out.print("Enter course duration in weeks: ");
                    int duration =  scanner.nextInt();
                    courseList.add(new Course(course, duration));
                    System.out.println("Course " + course + " is added.");
                }else if(num == 2){
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter enrollment id: ");
                    int enrollmentId = scanner.nextInt();
                    studentList.add(new Student(name,enrollmentId));
                    System.out.println("Student " + name + " is added.");
                }else if(num == 3){
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter course name: ");
                    String course = scanner.next();
                    Student studentToAdd = new Student("",0);
                    for (Student s : studentList) {
                        if(s.name.equalsIgnoreCase(name)){
                            studentToAdd = s;
                        }
                    }

                    for (Course c : courseList) {
                        if(c.name.equalsIgnoreCase(course)){
                            c.addStudent(studentToAdd);
                        }
                    }
                    System.out.println("Student " + name + " enrolled to " + course);
                }else if(num == 4){
                    System.out.print("Enter course name: ");
                    String course = scanner.next();
                    for (Course c : courseList) {
                        if(c.name.equalsIgnoreCase(course)){
                            c.printDetails();
                        }
                    }
                }else if(num == 5){
                    System.out.print("Enter course name: ");
                    String course = scanner.next();
                    for (Course c : courseList) {
                        if(c.name.equalsIgnoreCase(course)){
                            c.printClassList();
                        }
                    }
                }else{
                    System.out.println("Please enter only integers 1-5.");
                }

            }catch(InputMismatchException e){
                System.out.println("Please enter valid input");
            }

            System.out.print("Another action? (yes/no): ");
            ans = scanner.next();
        }
    }
}
