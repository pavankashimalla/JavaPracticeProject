package com.practiceJava.inheritance;

public class AllMathOperationsWithThreeNumbers extends AllMathOperationsWithTwoNumbers{
    public int addition(int a , int b , int c){
        int d = a + b + c;
        return d;
    }
    public int subtraction(int a , int b ,int c){
        int d = a - b - c;
        return d;
    }
    public int multiplication(int a ,int b , int c){
        int d = a * b * c;
        return d;
    }
    public int division(int a , int b , int c){
        int d = a / b / c;
        return d;
    }

}
