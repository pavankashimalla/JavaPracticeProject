package com.practiceJava;
import java.util.Scanner;

public class ArraysPractice {

   public void takingUserInputs(){
       // Scanner scannerObject = new Scanner(System.in);
       // System.out.println("Enter ArraySize : ");
     //   int arraySize = scannerObject.nextInt();

        int[] numbersArray = new int[]{2,4,7,2,8,4,9,0,0,-1,-3,-2};
        /*for (int index = 0 ; index < numbersArray.length;index ++){
            System.out.println("Enter ArrayValue : ");
            int arrayValue = scannerObject.nextInt();
            numbersArray[index] = arrayValue ;
        }

        for (int index = 0 ; index < numbersArray.length ; index ++){
            System.out.println(index +"=" + numbersArray[index]);
        }*/
       // valueBasedSearch(numbersArray);
     //   indexBasedSearch(numbersArray);
        //valueBasedCounter(numbersArray);
        //printEvenNumbers(numbersArray);
       // printReverseNumbers(numbersArray);
       // evenOddArray(numbersArray);
       updateArray(numbersArray);
    }
        //int[] numbersArray = new int[]{2,4,7,2,8,4,9,0,0,-1,-3,-2};
   public void updateArray(int[] numbersArray){
        Scanner scObject = new Scanner(System.in);
        System.out.println("Enter number to find : ");
        int findNumber = scObject.nextInt();
        System.out.println("Enter number to replace : ");
        int replaceNumber = scObject.nextInt();

        for (int i = 0 ; i < numbersArray.length ; i ++){
            if (numbersArray[i] == findNumber){
                numbersArray[i] = replaceNumber ;
                numbersArray[i] = numbersArray[i] * 3 ;
            }
        }
        for (int i = 0 ; i < numbersArray.length ; i ++){
            System.out.println(numbersArray[i]);
        }


   }

    public void valueBasedSearch(int[] array)  {
        boolean numberFound = false;
        Scanner scannerObject2 = new Scanner(System.in);
        System.out.println("Enter the searchValue : ");
        int givenValue = scannerObject2.nextInt();

        for (int i = 0 ; i < array.length ; i++){
            if(array[i] == givenValue){

                System.out.println(i + " = " + array[i]);
                //1 = 20
                numberFound = true;
                break;
            }
        }
            System.out.println("Given number is :" + numberFound);

        }
        public void indexBasedSearch(int[] array) {
        Scanner scannerObject3 = new Scanner(System.in);
        System.out.println("Enter the indexNumber : ");
        int givenNumber = scannerObject3.nextInt();
        System.out.println(array[givenNumber]);
    }
        public void valueBasedCounter(int[] array){
        Scanner scannerObject4 = new Scanner(System.in);
        System.out.println("Enter the number :");
        int userInputNumber = scannerObject4.nextInt();

        int counter = 0;
        for ( int i = 0 ; i < array.length ; i++){
            if (array[i] ==  userInputNumber){
               counter++;
            }
        }
            System.out.println("The given number "+ userInputNumber +" is present "+ counter +" times");

    }
        public void printEvenNumbers(int[] numberArray){
            int evenCounter = 0;
            int oddCounter = 0;
        for (int number = 0 ; number < numberArray.length ; number ++){
            if(number%2 == 0){
                evenCounter ++;
                System.out.println("Even numbers are : " +numberArray[number]);

            }else {
                oddCounter++;
                System.out.println("Odd numbers are : " + numberArray[number]);
            }
        }
         System.out.println("The even numbers are : "+evenCounter);
        System.out.println("The odd numbers are : "+oddCounter);

        }
        public void printReverseNumbers(int[] numberArray){

        for(int number = numberArray.length-1 ; number >= 0 ; number--){
            System.out.println("The reverse numbers are :"+ numberArray[number]);
        }

        }
        public void evenOddArray(int[] numberArray){
        int evenIndex = 0;
        int oddIndex = 0;
        int arraySize = numberArray.length;
       int[] evenArray = new int[arraySize];
       int[] oddArray = new int[arraySize];

        for (int i = 0 ; i < arraySize ; i ++){
            int number = numberArray[i];
                 if (number%2==0){
                      evenArray[evenIndex] = number;

                        evenIndex++;
                 }else {
                     oddArray[oddIndex] = number;
                     oddIndex++;
                 }

        }
        System.out.println("Even numbers are : ");
        for (int i = 0 ; i < arraySize ; i++){
           System.out.println(evenArray[i]);

        }
        System.out.println("Odd numbers are :");
        for (int i = 0 ; i < arraySize ; i++){
        System.out.println(oddArray[i]);
        }

        //mergingArrays(evenArray , oddArray);
          //  mergingArraysReverse(evenArray , oddArray);
           // mergingReverse(evenArray , oddArray);
           // mergingReverseWhileLoop(evenArray , oddArray);

        }


        public void mergingArrays(int[] evenArray , int[] oddArray){
         int allVariableArrayIndex = 0;


         int[] allVariableArray = new int[evenArray.length + oddArray.length];

         for (int i = 0 ; i < evenArray.length ; i++){
             allVariableArray[allVariableArrayIndex] = evenArray[i];
             allVariableArrayIndex++;
         }
         for (int i = 0 ; i < oddArray.length ; i++){
             allVariableArray[allVariableArrayIndex] = oddArray[i];
             allVariableArrayIndex++;
         }
        System.out.println("All variable array values are : ");
        for (int i = 0 ; i < allVariableArray.length ; i ++ ){
            System.out.println(allVariableArray[i]);

        }

    }
    public void mergingArraysReverse(int[] evenArray , int[] oddArray){
       //int allVariableArrayIndex =  ;

        int[] allVariableArray = new int[evenArray.length + oddArray.length];//6
        int allVariableArrayIndex = allVariableArray.length -1 ;//6

        for(int i = 0 ; i < evenArray.length ; i++){
           allVariableArray[allVariableArrayIndex] = evenArray[i];
            allVariableArrayIndex --;
        }
        for (int oddArrayIndex = 0 ; oddArrayIndex < oddArray.length ; oddArrayIndex++){
           allVariableArray[allVariableArrayIndex] =  oddArray[oddArrayIndex];
           allVariableArrayIndex -- ;
        }
        System.out.println("reverse merging array values are : ");
        for (int i = 0 ; i < allVariableArray.length ; i ++){
            System.out.println(allVariableArray[i]);
        }
    }
    public void mergingReverse(int[] evenArray , int[] oddArray){
        int[] allVariableArray = new int[evenArray.length + oddArray.length];
        int allVariableIndex = allVariableArray.length - 1;

        for (int i = evenArray.length - 1 ; i >= 0 ; i --){
          allVariableArray[allVariableIndex] = evenArray[i];
          allVariableIndex -- ;
        }
        for (int i = oddArray.length - 1 ; i >= 0 ; i --){
            allVariableArray[allVariableIndex] = oddArray[i];
            allVariableIndex -- ;
        }
        System.out.println("Reverse merging values are : ");
        for (int i = 0 ; i < allVariableArray.length ; i++){
            System.out.println(allVariableArray[i]);
        }
    }
    public void mergingReverseWhileLoop(int[] evenArray , int[] oddArray){
        int[] allVariableArray = new int[evenArray.length + oddArray.length];
        int allVariableIndex = allVariableArray.length - 1;
        int i = evenArray.length - 1;
        int j = oddArray.length - 1 ;

        while ( i >= 0 ){
            allVariableArray[allVariableIndex] = evenArray[i];
            allVariableIndex -- ;
            i -- ;
        }
        while (  j >= 0 ){
            allVariableArray[allVariableIndex] = oddArray[j];
            allVariableIndex -- ;
            j -- ;
        }
        System.out.println("Reverse merging values in while loop  : ");
        int k = 0 ;
        while ( k < allVariableArray.length ){
            System.out.println(allVariableArray[k]);
            k++ ;
        }
    }


    public static void main(String[] args){
        ArraysPractice object = new ArraysPractice();
        object.takingUserInputs();


   }



}
