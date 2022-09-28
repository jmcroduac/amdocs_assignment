package com.training.day10_assignment.ATM;

public class Account {

    int balance = 1000;
    synchronized void withdraw(String name, int amount){
        System.out.println(name + " is trying to withdraw " + amount);

        if (balance >= amount) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            balance -= amount;
            System.out.println(name + " has finished withdrawing " + amount);

        } else {
            System.out.println("Not enough in account for " + name + " to withdraw " + amount);
        }

        System.out.println("Remaining balance is " + balance);

    }

    int getBalance(){
        return balance;
    }
}
