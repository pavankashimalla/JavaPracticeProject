package com.practiceJava.collectionsPractice;
import java.util.*;

public class ListPractice2 {


    public ArrayList<String> creatingList(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        System.out.println("Enter the names : " );
        for (int i = 0 ; i < size ; i++){
            arrayList.add(sc.next());
        }
        return arrayList;

    }
    public void printingList(ArrayList<String> arrayList){

   for (int i = 0 ; i < arrayList.size();i++){
     String name = arrayList.get(i);

       System.out.println(name);
   }
       // System.out.println(arrayList);
  // arrayList.set(1 , "pavan");
       // System.out.println(arrayList);

    }
    public void reversePrinting(ArrayList<String> arrayList){
        for (int i = arrayList.size() - 1 ; i >= 0 ; i--){
            String name = arrayList.get(i);
            System.out.println(name);
        }
    }
    public void stringBasedCounter(ArrayList<String> arrayList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String inPutString = scanner.next();
        int counter = 0;
        for (int i = 0 ; i < arrayList.size() ; i++){
            if (arrayList.get(i).equals(inPutString)){
                counter++;
            }
        }
        System.out.println("Given String is " + counter + " Times");

    }
    public void removingArray(ArrayList<String> arrayList){
        for (int i = 0 ; i < arrayList.size() ; ){
             arrayList.remove(i);
        }
        printingList(arrayList);

    }



    public void myMainMethod(){
        ArrayList<String> namesList = creatingList();
       // printingList(namesList);
       // removingArray(namesList);
       // reversePrinting(namesList);
        stringBasedCounter(namesList);
    }
    public static void main(String[] args){
        ListPractice2 object = new ListPractice2();
    object.myMainMethod();
    }

}
