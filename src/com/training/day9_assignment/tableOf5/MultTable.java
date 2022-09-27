package com.training.day9_assignment.tableOf5;

public class MultTable extends Thread{
    MultTable(int priority){
        new Thread();
        setPriority(priority);
        System.out.println("Thread: " + this);
        start();
    }

    @Override
    public void run() {
        try{
            for(int i = 1; i <= 10; i++) {
                System.out.println("5 x " + i + " = " + (5*i));
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("Multiplication Table thread is interrupted.");
        }

        System.out.println("Multiplication Table thread has finished running.");
    }
}
