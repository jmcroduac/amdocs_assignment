package com.training.day9_assignment.tableOf5;

public class OddOrEven extends Thread{

    OddOrEven(int priority){
        new Thread();
        setPriority(priority);
        System.out.println("Thread: " + this);
        start();
    }

    @Override
    public void run() {
        String result;
        try{
            for(int i = 1; i <= 10; i++) {
                if((5*i)%2 == 0){
                    result = "even";
                }else{
                    result = "odd";
                }
                System.out.println((5*i) + " is " + result);
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("Odd or Even thread is interrupted.");
        }

        System.out.println("Odd or Even thread has finished running.");
    }
}
