package com.practiceJava.abstractPractice;

public class Bike extends Vehicle{
    @Override
    public void gears() {
        System.out.println("using gears");
    }

    @Override
    public void engine() {
    System.out.println("bike engine");
    }
    
}
