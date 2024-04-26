package com.practiceJava.abstractPractice;

public abstract class Vehicle implements InterfaceAbstract {
public void handle(){
    System.out.println("moving handle");
}
public void breaking(){
    System.out.println("using breaks");
}
public abstract void gears();
public abstract void engine();


}
