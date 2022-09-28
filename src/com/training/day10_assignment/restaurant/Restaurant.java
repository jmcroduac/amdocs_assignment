package com.training.day10_assignment.restaurant;

public class Restaurant {
    Order order; // Package access

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Waiter waitPerson = new Waiter(restaurant);
        Chef chef = new Chef(restaurant, waitPerson);
    }
}
