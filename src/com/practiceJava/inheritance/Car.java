package com.practiceJava.inheritance;

public class Car extends Bike {

public void display(){

    System.out.println("speed meter");
}
public void handle(){
    System.out.println("steering");
}
public void wheels(){
    System.out.println("four wheels");
}
public void engine(){
   // super.engine();
    System.out.println("car engine");
}
}
