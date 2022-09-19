package com.training.day3_assignment;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        SportFactory sportFactory = new SportFactory();

        Sport sport1 = sportFactory.getSport("badminton");
        sport1.play();

        Sport sport2 = sportFactory.getSport("football");
        sport2.play();

    }
}
