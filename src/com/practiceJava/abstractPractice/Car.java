package com.practiceJava.abstractPractice;

public class Car extends Vehicle{
    @Override
    public void gears() {
        System.out.println("using gears");
    }

    @Override
    public void engine() {
    System.out.println("car engine");
    }
    public void wheels(){
        System.out.println("four wheels");
    }
}
