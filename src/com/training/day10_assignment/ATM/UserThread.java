package com.training.day10_assignment.ATM;

public class UserThread implements Runnable{
    String name;
    int amount;
    Account obj;
    Thread t;
    UserThread(String name, int amount, Account obj){
        this.obj = obj;
        this.name = name;
        this.amount = amount;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        obj.withdraw(name, amount);
    }
}
