package com.training.assignment1;

public class MyClass {
    public static void main(String[] args) {


        //Assignment #1
        Student s1 = new Student("Taylor", 21, 1, 34);
        Student s2 = new Student("Ariana", 23, 2, 20);
        Student s3 = new Student("Dua", 22, 3, 80);
        Student s4 = new Student("Doja", 20, 4, 29);
        Student s5 = new Student("Olivia", 21, 5, 45);


        //Assignment #2
        String s = "i love java";
        char lower = s.charAt(0);
        char upper = Character.toUpperCase(lower);
        String fletter = Character.toString(upper);
        String result = fletter + s.substring(1,s.length());
        System.out.println("Initial String: " + s);
        System.out.println("Resulting String: " +result);


        //Assignment #3
        Employee e1 = new Employee("Kate",3);
        Employee e2 = new Employee("Harry",2);
        Employee e3 = new Employee("Diana",1);
        Employee e4 = new Employee("Charles",4);
        Employee e5 = new Employee("Elizabeth",5);

        Employee[] arr = {e1,e2,e3,e4,e5};

        //Sort the array in ascending order using two for loops
        Employee temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i].years_exp >arr[j].years_exp) {      //swap elements if not in order
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Printing the results
        for(Employee emp : arr){
            System.out.println("Employee Name: " + emp.name + " | Years of Experience: " + emp.years_exp);
        }

    }
}
