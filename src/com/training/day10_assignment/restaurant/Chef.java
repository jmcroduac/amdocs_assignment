package com.training.day10_assignment.restaurant;

import static java.lang.Thread.sleep;

public class Chef implements Runnable{
    private Restaurant restaurant;

    private Waiter waitPerson;
    Thread t;

    public Chef(Restaurant r, Waiter w) {
        restaurant = r;
        waitPerson = w;
        t = new Thread(this, "Chef");
        t.start();
    }

    public void run() {
        while (true) {
            if (restaurant.order == null) {
                restaurant.order = new Order();
                System.out.println("Chef is preparing the dish");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Dish is ready to be served!");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (waitPerson) {
                    waitPerson.notify();
                }
            }

        }
    }
}
