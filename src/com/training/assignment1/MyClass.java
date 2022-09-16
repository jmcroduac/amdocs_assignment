package com.training.assignment1;

public class MyClass {
    public static void main(String[] args) {


        //Assignment #1
        com.training.assignment1.Student s1 = new com.training.assignment1.Student("Taylor", 21, 1, 34);
        com.training.assignment1.Student s2 = new com.training.assignment1.Student("Ariana", 23, 2, 20);
        com.training.assignment1.Student s3 = new com.training.assignment1.Student("Dua", 22, 3, 80);
        com.training.assignment1.Student s4 = new com.training.assignment1.Student("Doja", 20, 4, 29);
        com.training.assignment1.Student s5 = new com.training.assignment1.Student("Olivia", 21, 5, 45);


        //Assignment #2
        String s = "i love java";
        char lower = s.charAt(0);
        char upper = Character.toUpperCase(lower);
        String fletter = Character.toString(upper);
        String result = fletter + s.substring(1,s.length());
        System.out.println("Initial String: " + s);
        System.out.println("Resulting String: " +result);


        //Assignment #3
        com.training.assignment1.Employee e1 = new com.training.assignment1.Employee("Kate",3);
        com.training.assignment1.Employee e2 = new com.training.assignment1.Employee("Harry",2);
        com.training.assignment1.Employee e3 = new com.training.assignment1.Employee("Diana",1);
        com.training.assignment1.Employee e4 = new com.training.assignment1.Employee("Charles",4);
        com.training.assignment1.Employee e5 = new com.training.assignment1.Employee("Elizabeth",5);

        com.training.assignment1.Employee[] arr = {e1,e2,e3,e4,e5};

        //Sort the array in ascending order using two for loops
        com.training.assignment1.Employee temp;
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
        for(com.training.assignment1.Employee emp : arr){
            System.out.println("com.training.assignment1.Employee Name: " + emp.name + " | Years of Experience: " + emp.years_exp);
        }

    }
}
