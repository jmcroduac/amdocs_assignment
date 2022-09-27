package com.training.day9_assignment.multipleThreads;

public class DemoThread1 extends Thread{
    Thread t;
    DemoThread1(String name, int priority){
        new Thread();
        setName(name);
        setPriority(priority);
        System.out.println("Thread: " + this);
        start();
    }
    @Override
    public void run() {

        for(int i = 5; i > 0; i--){
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " is interrupted");
            }
        }

        System.out.println(getName() + " has finished running.");
    }

}
