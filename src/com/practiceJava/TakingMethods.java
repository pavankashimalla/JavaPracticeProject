package com.practiceJava;
import java.util.Scanner;

public class TakingMethods {
    public void callingMethods(){
        OperationsInput object = new OperationsInput();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'a' value ");
        int number = scanner.nextInt();
        System.out.println("Enter the 'b' value ");
        int number2 = scanner.nextInt();
        System.out.println("Enter the 'c' value ");
        int number3 = scanner.nextInt();
        int result = object.addNumbers(number, number2, number3);
        System.out.println("addition result = "+ result);
        double result2 = object.multiplication( number, number2 , number3 );
        System.out.println("multiplication result = "+ result2);
    }
        public static void main(String[] args){
        TakingMethods object2 = new TakingMethods();
        object2.callingMethods();

    }

}
