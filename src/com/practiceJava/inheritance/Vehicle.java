package com.practiceJava.inheritance;

public class Vehicle {
    public static void main(String[] args){
        Cycle cycle = new Cycle();
        cycle.handle();
        cycle.breaking();
        cycle.wheels();


        Bike bike = new Bike();
        bike.handle();
        bike.breaking();
        bike.engine();
        bike.cluch();
        bike.gears();
        bike.wheels();


        Car car = new Car();
        car.display();
        car.handle();
        car.breaking();
        car.cluch();
        car.engine();
        car.gears();
        car.wheels();


    }

}
