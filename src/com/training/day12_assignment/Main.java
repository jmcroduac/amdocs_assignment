package com.training.day12_assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ans = "yes";
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();

        while(ans.equalsIgnoreCase("yes")){
            shoppingCart.displayMenu();
            String action = scanner.nextLine();

            if(action.equalsIgnoreCase("1")){
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                System.out.print("Enter item price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter item category (Grocery/Electronics/Kids): ");
                String category = scanner.nextLine();

                shoppingCart.addItem(new Item(name,price),category);
            }else if(action.equalsIgnoreCase("2")){
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();

                shoppingCart.removeItem(name);
            }else if(action.equalsIgnoreCase("3")){
                shoppingCart.displayItems();
            }else{
                System.out.println("Please enter numbers 1-3 only.");
            }

            System.out.print("Want to do another action? (yes/no): ");
            ans = scanner.nextLine();
        }

    }
}
