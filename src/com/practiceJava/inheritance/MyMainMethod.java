package com.practiceJava.inheritance;

public class MyMainMethod {
    public void example(){

    }
    public static void main(String[] args){
        AllMathOperationsWithThreeNumbers object = new AllMathOperationsWithThreeNumbers();
       int result = object.addition(20,54);
       System.out.println(result);
        int result2 = object.subtraction(67,98);
        System.out.println(result2);
        int result3 = object.multiplication(55,46);
        System.out.println(result3);

        try {
            int result4 = object.division(9,0);
        }
        catch (ArithmeticException ae){


            System.out.println(ae.toString());
           // throw ae;
            //int result4 = object.division(9,1);
        }
        finally {
            System.out.println("finally block");
        }
       // System.out.println(result4);


        int result5 =  object.addition(22,67,99);
        System.out.println(result5);
        int result6 =  object.subtraction(87,89,56);
        System.out.println(result6);
        int result7 =  object.multiplication(24,78,58);
        System.out.println(result7);
        int result8 =  object.division(112,6663,89);
        System.out.println(result8);
    }
}
