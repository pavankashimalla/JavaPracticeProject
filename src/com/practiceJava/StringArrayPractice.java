package com.practiceJava;

import java.util.Scanner;

public class StringArrayPractice {
    public void myMainMethod(){
        String[] myStringArray = new String[]{"Java","is","a","object","oriented","program","java","program"};

        stringBasedSearch(myStringArray);
        indexBasedSearch(myStringArray);
        stringBasedCounter(myStringArray);
        printReverseString(myStringArray);
        swappingPractice();
        swappingArray();
        swappingIntArray();
        swappingWithInt();
        numbersOutput();
        charOutput();
        numberArrayOutput();
    }
    public void swappingPractice(){
        int a = 10 ;
        int b = 20 ;
        int c = a;
        a = b;
        b = c ;
        System.out.println(" a " + " = " + a);
        System.out.println(" b " + " = " + b);
    }
    public void swappingArray(){
        String[] array1 = new String[]{"pavan","intellijIdea"};
        String[] array2 = new String[]{"kumar","ecllipse"};
        String[] array3 = array1;
        array1 = array2;
        array2 = array3;
       for (int i = 0 ; i < array1.length ; i++){
           System.out.println(array1[i]);
       }
        for (int i = 0 ; i < array2.length ; i++){
            System.out.println(array2[i]);
        }
    }
    public void swappingWithInt (){
        int a = 20;
        int b = 30;
       /* a = a + b ; // 20 + 30 = 50
        b = a - b ; // 50 - 30 = 20
        a = a - b ; // 50 - 20 = 30
        System.out.println(a);
        System.out.println(b);*/
        a = a * b ;

        b = a / b ;
        a = a / b ;
        System.out.println(a);
        System.out.println(b);
    }
    public void numbersOutput(){
        int counter = 1;
        int lastNumber = 20;
        for (int i = 1 ; i <= lastNumber ; i ++){
            System.out.print(i+" ");
            if (counter == 5){

                System.out.println("\n");
                counter = 1;
            }else {
                counter++;
            }

            }

        }
        public void charOutput(){
        int counter = 1;
        char[] myCharArray = new char[]{'p','r','i','n','g','l','E','s','5','[','q','v','?','Z'};

        for (int i = 0 ; i < myCharArray.length ; i++){
            System.out.print(myCharArray[i] + " ");
            if (counter == 4){
                System.out.println("\n");
                counter = 1;
            }else {
                counter++;
            }
        }

        }
     public void numberArrayOutput(){
        int[] numberArray = new int[]{55,66,77,88,99,100,111,222,333,444,555,666,777,888,999,1000};
        int counter = 1;
        for (int i = 0; i < numberArray.length ; i++){
            System.out.print(numberArray[i] + " ");
            if (counter == 5){
                System.out.println("\n");
                counter = 1;
            }else {
                counter++;
            }
        }

     }



    public void swappingIntArray(){
        int[] firstArray = new int[]{10,20,30,40,50};
        int[] secondArray = new int[]{100,200,300,400,500};

        for (int i = 0 ; i < firstArray.length ; i++){
           int tempVariable;
            tempVariable = firstArray[i];
            firstArray[i] = secondArray[i];
            secondArray[i] = tempVariable;
        }
        for (int i = 0 ; i < firstArray.length ; i++) {
            System.out.println("First array value : " + firstArray[i]);
        }
        for (int i = 0 ; i < secondArray.length ; i++){
            System.out.println("Second array value : " + secondArray[i]);
        }
    }
    public void stringBasedSearch(String[] stringInPutArray){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the string ");
        String inPutString = scannerObject.next();

        boolean stringFound = false;

        for (int i = 0 ; i < stringInPutArray.length ; i++){
            if(stringInPutArray[i].equalsIgnoreCase(inPutString)){
                System.out.println(stringInPutArray[i]);
                stringFound = true;
                break;
            }
        }
        System.out.println("Given string is "+ stringFound);
    }
    public void indexBasedSearch(String[] stringInputArray){
        Scanner scannerObject2 = new Scanner(System.in);
        System.out.println("Enter the string index ");
        int inPutString = scannerObject2.nextInt();
        System.out.println(stringInputArray[inPutString]);
    }
    public void stringBasedCounter(String[] stringInputArray){
        Scanner scannerObject3 = new Scanner(System.in);
        System.out.println("Enter the string ");
        String inPutString = scannerObject3.next();

        int counter = 0;
        for (int i = 0 ; i < stringInputArray.length ; i++){
            if (stringInputArray[i].equalsIgnoreCase(inPutString)){
                counter++;
            }
        }
        System.out.println("Given string "+ inPutString + " is " + counter + " Times ");
    }
    public void printReverseString (String[] stringInputArray){
        for (int i = stringInputArray.length - 1 ; i >= 0 ; i --){
            System.out.println("Reverse string : " + stringInputArray[i]);
        }

    }
public static void main(String[] args){
    StringArrayPractice object = new StringArrayPractice();
    object.myMainMethod();
}




}
