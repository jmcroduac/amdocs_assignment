package com.training.day12_assignment.shopping;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("Egg",25),"Grocery");
        shoppingCart.addItem(new Item("Milk",34),"Grocery");
        shoppingCart.addItem(new Item("Light bulb",25),"Electronics");
        shoppingCart.addItem(new Item("Toy Car",50),"Kids");
        shoppingCart.addItem(new Item("Battery",10),"Electronics");
        shoppingCart.addItem(new Item("Rice",40),"Grocery");

        shoppingCart.displayItems();

        shoppingCart.removeItem("Egg");
        shoppingCart.removeItem("Toy Car");

        shoppingCart.displayItems();
    }
}
