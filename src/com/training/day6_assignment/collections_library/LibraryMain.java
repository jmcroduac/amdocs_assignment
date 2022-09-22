package com.training.day6_assignment.collections_library;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

        String ans = "yes";

        HashMap<String, String> library = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while(ans.equals("yes")){
            System.out.println("Library Menu:");
            System.out.println("1. Add new member");
            System.out.println("2. View all members");
            System.out.println("3. View members by address");
            System.out.println("Enter number of the action you want to do: ");

            int num = scanner.nextInt();

            if(num == 1){
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter address: ");
                String address = scanner.next();

                library.put(name,address);
            }else if(num == 2){
                if(library.isEmpty()){
                    System.out.println("The library has no members yet.");
                }
                library.forEach((key, value) -> System.out.println("Name: " + key + " Address: " + value));

            }else if(num == 3){
                System.out.print("Enter address: ");
                String address = scanner.next();

                for(Map.Entry<String,String> set : library.entrySet()){
                    if (set.getValue().equalsIgnoreCase(address)){
                        System.out.println("Name: " + set.getKey());
                    }
                }
            }else{
                System.out.println("Please enter only integers 1-3.");
            }

            System.out.print("Another action? (yes/no): ");
            ans = scanner.next();
        }
    }
}
