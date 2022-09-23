package com.training.day7_assignment.phonebook;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhonebookMain {
    public static void main(String[] args) {
        String ans = "yes";
        HashMap<String, String> phonebook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while(ans.equalsIgnoreCase("yes")){
            System.out.println("Phonebook Simulator Menu:");
            System.out.println("1. Add contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Search a contact");
            System.out.println("4. Remove a contact");
            System.out.println("Enter number of the action you want to do: ");

            try{
                int num = scanner.nextInt();

                if(num == 1){
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter phone number: ");
                    String number = scanner.next();
                    phonebook.put(name,number);
                    System.out.println(name + " is added to contacts.");

                }else if(num == 2){
                    if(phonebook.isEmpty()){
                        System.out.println("Contacts is empty");
                    }else{
                        phonebook.forEach((key, value) -> System.out.println("Name: " + key + " Phone number: " + value));
                    }
                }else if(num == 3){
                    System.out.print("Enter name: ");
                    String name = scanner.next();

                    if(phonebook.containsKey(name)){
                        System.out.println("Name: " + name + " Phone number: " + phonebook.get(name));
                    }else{
                        System.out.println(name + " cannot be found in the contacts");
                    }
                }else if(num == 4){
                    System.out.print("Enter name: ");
                    String name = scanner.next();

                    if(phonebook.containsKey(name)){
                        phonebook.remove(name);
                        System.out.println(name + " removed from contacts");
                    }else{
                        System.out.println(name + " cannot be found in the contacts");
                    }
                }else{
                    System.out.println("Please enter only integers 1-4.");
                }

            }catch(InputMismatchException e){
                System.out.println("Please enter valid input");
            }

            System.out.print("Another action? (yes/no): ");
            ans = scanner.next();
        }
    }
}
