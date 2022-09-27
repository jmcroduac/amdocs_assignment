package com.training.day9_assignment.multipleThreads;

public class ThreadMain {
    public static void main(String[] args) {
        DemoThread1 t1 = new DemoThread1("Demo Thread 1",10);
        DemoThread1 t2 = new DemoThread1("Demo Thread 2",5);
        DemoThread1 t3 = new DemoThread1("Demo Thread 3",1);

        try{
            for(int i = 5; i > 0; i--) {
                System.out.println("The Main Thread: " + i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread is interrupted.");
        }

        System.out.println("Main thread has finished running.");

    }
}
