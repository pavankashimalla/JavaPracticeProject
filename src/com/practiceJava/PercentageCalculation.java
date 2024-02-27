package com.practiceJava;
import java.util.Scanner;

public class PercentageCalculation {
    public void simplePercentage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value : ");
        double inputFromUser = scanner.nextDouble();
        System.out.println("Enter b value : ");
        double inputFromUser2 = scanner.nextDouble();
        double result = methodLogic(inputFromUser,inputFromUser2);
        System.out.println(result);
    }
        public double methodLogic(double a , double b) {
            double percentageResult = (a / b ) * 100;
            return percentageResult;
        }

        public static void main(String[] args){
            PercentageCalculation object = new PercentageCalculation();
            object.simplePercentage();
        }
}
