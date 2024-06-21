package com.practiceJava.collectionsPractice;

import java.util.*;

public class ListPractice3 {
    public LinkedList<String> creatingList(){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        System.out.println("Enter the names : ");
        for (int i = 0 ; i < size ; i++){
            linkedList.add(sc.next());
        }
        return linkedList;
    }
    public void printingList(LinkedList<String> linkedList){
        for (int i = 0 ; i < linkedList.size() ; i++){
          String name = linkedList.get(i);
          System.out.println(name);
        }
    }
    public void removingList(LinkedList<String> linkedList){
        for (int i = 0 ; i < linkedList.size() ; i++){
            linkedList.get(i);
        }
        printingList(linkedList);
    }
    public void reversePrinting(LinkedList<String> linkedList){
        for (int i = linkedList.size() - 1 ; i >=0 ; i--){
          String name = linkedList.get(i);
          System.out.println(name);
        }
    }
    public void stringBasedCounter(LinkedList<String> linkedList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String inPut = scanner.next();
        int counter = 0;
        for (int i = 0 ; i < linkedList.size() ; i++){
          if (linkedList.get(i).equals(inPut)){
              counter++;
          }
        }
        System.out.println("Given String is " + counter + " times");

    }
    public void updatingList(LinkedList<String> linkedList){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the inPut String : ");
        String findString = scanner1.next();
        String findString2 = scanner1.next();
        System.out.println("Enter the replace String : ");
        String replaceString = scanner1.next();
        String replaceString2 = scanner1.next();
        for (int i = 0 ; i < linkedList.size() ; i++){
           if (linkedList.get(i).equals(findString)){
              linkedList.set(i , replaceString);
           }
        }
        for (int j = 0 ; j < linkedList.size();j++){
            if (linkedList.get(j).equals(findString2)){
                linkedList.set(j , replaceString2);
            }
        }
       System.out.println(linkedList);

        }




    public void myMainMethod(){
     LinkedList<String> namesList = creatingList();
   //  printingList(namesList);
     //reversePrinting(namesList);
    // removingList(namesList);
    // stringBasedCounter(namesList);
     updatingList(namesList);
    }
    public static void main(String[] args){
        ListPractice3 object = new ListPractice3();
        object.myMainMethod();
    }
}
