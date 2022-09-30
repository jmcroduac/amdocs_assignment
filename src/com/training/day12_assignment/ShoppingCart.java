package com.training.day12_assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    HashMap<Item, String> shoppingCart = new HashMap<>();

    void addItem(Item item, String category){
        shoppingCart.put(item,category);
        System.out.println("Item " + item.name + " is added to the shopping cart.");
    }

    void removeItem(String name){
        Item toBeRemoved = new Item("",0);
        for (Map.Entry<Item, String> set : shoppingCart.entrySet()) {
            if(set.getKey().name.equalsIgnoreCase(name)){
                toBeRemoved = set.getKey();
            }
        }
        shoppingCart.remove(toBeRemoved);
        System.out.println("Item " + name + " is removed from the shopping cart.");
    }

    void displayItems(){
        System.out.println();
        ArrayList<Item> groceryItems = new ArrayList<>();
        ArrayList<Item> electronicItems = new ArrayList<>();
        ArrayList<Item> kidsItems = new ArrayList<>();

        for (Map.Entry<Item, String> set : shoppingCart.entrySet()) {
            if(set.getValue().equalsIgnoreCase("Grocery")){
                groceryItems.add(set.getKey());
            }else if(set.getValue().equalsIgnoreCase("Electronics")) {
                electronicItems.add(set.getKey());
            }else if(set.getValue().equalsIgnoreCase("Kids")) {
                kidsItems.add(set.getKey());
            }
        }

        double groceryTotal = 0;
        double electronicsTotal = 0;
        double kidsTotal = 0;
        double overallTotal;

        for (Item item : groceryItems) {
            groceryTotal += item.price;
        }

        for (Item item : electronicItems) {
            electronicsTotal += item.price;
        }

        for (Item item : kidsItems) {
            kidsTotal += item.price;
        }

        overallTotal = groceryTotal + electronicsTotal + kidsTotal;

        if(!groceryItems.isEmpty()){
            System.out.println("---GROCERY ITEMS---");
            for (Item item : groceryItems) {
                System.out.println(item.name + " -> " + item.price);
            }
            System.out.println("Grocery items total amount: " + groceryTotal);
        }

        if(!electronicItems.isEmpty()){
            System.out.println("---ELECTRONICS ITEMS---");
            for (Item item : electronicItems) {
                System.out.println(item.name + " -> " + item.price);
            }
            System.out.println("Electronics items total amount: " + electronicsTotal);
        }

        if(!kidsItems.isEmpty()){
            System.out.println("---KIDS ITEMS---");
            for (Item item : kidsItems) {
                System.out.println(item.name + " -> " + item.price);
            }
            System.out.println("Kids items total amount: " + kidsTotal);
        }

        System.out.println("---------------------");
        System.out.println("OVERALL TOTAL AMOUNT: " + overallTotal + "\n");
    }

    void displayMenu(){
        System.out.println("Shopping Cart Menu:");
        System.out.println("1. Add item");
        System.out.println("2. Remove Item");
        System.out.println("3. Display items and total amount");
        System.out.print("Enter number of desired action: ");
    }
}
