package com.practiceJava;
import java.util.Scanner;

public class ForLoopDemo {
    public void userInputs( ){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter Staring Number : ");
        int number1 = scannerObject.nextInt();
        System.out.println("Enter Ending Number :");
        int number2 = scannerObject.nextInt();
        printingNumbers(number1 , number2);
        // printAlternateNumbers(number1 , number2);

    }
    public void printingNumbers(int staringNumber , int endingNumber){

        for (int i = staringNumber ; i <= endingNumber ; i++){
            if (i == 1500){
                break;
            }

            System.out.println(i);
        }

    }
    public void printAlternateNumbers(int firstNumber , int lsatNumber){

        for (int i = firstNumber ; i <= lsatNumber ; i+=2 ){


            System.out.println(i);

        }
    }
    public void arrayPractice(){
        int[] array = new int[6];
        array[0] = 65;
        array[1] = 74;
        array[2] = 52;
        array[3] = 12;
        array[4] = 69;
        array[5] = 38;

        for (int i = 0;i < array.length ; i++){
            System.out.println(array[i]);
        }
       /* for (int arr:array){
            System.out.println(arr);
        }*/

    }


    public static void main(String[] args){
        ForLoopDemo object = new ForLoopDemo();
      //  object.userInputs();
        object.arrayPractice();
    }

}

