package com.practiceJava.collectionsPractice;

import java.util.*;

public class ListPractice4 {
    public void creatingList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter the size :");
        int size = scanner.nextInt();
        System.out.println("Enter the values : ");
        for (int i = 0 ; i < size ; i++){
            arrayList.add(scanner.nextInt());
        }
        System.out.println("before sort : " + arrayList);
       // Collections.sort(arrayList);
        Collections.sort(arrayList , Collections.reverseOrder());
        System.out.println("after sort : " + arrayList);

    }
    public void creatingLinkedList(){
        Scanner scanner1 = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter the size : ");
        int size = scanner1.nextInt();
        System.out.println("Enter the values : ");
        for (int i = 0 ; i< size ; i++){
            linkedList.add(scanner1.nextInt());
        }
        System.out.println("before sort : " + linkedList);
        Collections.sort(linkedList);
       // Collections.sort(linkedList , Collections.reverseOrder());
        System.out.println("after sort : " + linkedList);
    }


    public static void main(String[] args){
        ListPractice4 object = new ListPractice4();
       // object.creatingList();
        object.creatingLinkedList();
    }
}
