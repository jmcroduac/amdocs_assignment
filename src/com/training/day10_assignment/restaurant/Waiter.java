package com.training.day10_assignment.restaurant;

import static java.lang.Thread.sleep;

public class Waiter implements Runnable{
    private Restaurant restaurant;
    Thread t;

    public Waiter(Restaurant r) {
        restaurant = r;
        t = new Thread(this,"Waiter");
        t.start();
    }

    public void run() {
        while (true) {
            while (restaurant.order == null)
                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            System.out.println("Waiter has served " + restaurant.order);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            restaurant.order = null;
        }
    }
}
