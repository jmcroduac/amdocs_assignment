package com.training.day10_assignment.restaurant;

public class Order {
    private static int i = 0;

    private int count = i++;

    public Order() {
        if (count == 6) {
            System.out.println("Restaurant is closed");
            System.exit(0);
        }
    }

    public String toString() {
        return "Order " + count;
    }
}
