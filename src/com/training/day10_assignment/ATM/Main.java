package com.training.day10_assignment.ATM;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        UserThread u1 = new UserThread("Harry",500,account);
        UserThread u2 = new UserThread("Meghan",600,account);
        UserThread u3 = new UserThread("Kate",300,account);

        try{
            u1.t.join();
            u2.t.join();
            u3.t.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted::");
        }

    }
}
