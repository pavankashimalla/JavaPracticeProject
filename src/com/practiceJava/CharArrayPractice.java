package com.practiceJava;

import java.util.Scanner;

public class CharArrayPractice {

    public void myMainMethod(){
        char[] myCharArray = new char[] {'P','A','V','A','n','1','5','.','{','@'};

       // valueBasedSearch(myCharArray);
       // indexBasedSearch(myCharArray);
        valueBasedCounter(myCharArray);
       // printReverseChar(myCharArray);
    }
    public void valueBasedSearch (char[] inPutCharArray){
        boolean numberFound = false;
        Scanner scannerObject1 = new Scanner(System.in);
        System.out.println("Enter searchValue : ");
        char searchValue = scannerObject1.next().charAt(0);

        for (int i = 0 ; i < inPutCharArray.length ; i ++){
            if (inPutCharArray[i] == searchValue){
                System.out.println(inPutCharArray[i]);
                numberFound = true;
                break;
            }
        }
        System.out.println("Given char is : "+numberFound);
    }
    public void indexBasedSearch (char[] inPutCharArray){
        Scanner scannerObject2 = new Scanner(System.in);
        System.out.println("Enter the index Number :");
        int indexNumber = scannerObject2.nextInt();
        System.out.println(inPutCharArray[indexNumber]);
    }
    public void valueBasedCounter(char[] inPutCharArray){
        Scanner scannerObject3 = new Scanner(System.in);
        System.out.println("Enter the char :");
        char charValue = scannerObject3.next().charAt(0);

        int counter = 0;
         for (int i = 0 ; i < inPutCharArray.length ; i++){
             if(inPutCharArray[i] == charValue){
                 counter++;
             }
         }
        System.out.println("The given char "+ charValue +" is present "+  counter + " Times");


    }
    public void printReverseChar(char[] inPutCharArray){
        for (int i = inPutCharArray.length - 1; i >= 0  ; i --){
            System.out.println("Reverse characters are : "+inPutCharArray[i]);
        }
    }


    public static void main(String[] args){
        CharArrayPractice object = new CharArrayPractice();
        object.myMainMethod();
    }
}


