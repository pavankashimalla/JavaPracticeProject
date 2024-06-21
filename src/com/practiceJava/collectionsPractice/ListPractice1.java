package com.practiceJava.collectionsPractice;
import java.util.*;

public class ListPractice1 {
    public void myMainMethod(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(36);
        arrayList.add(45);
        arrayList.add(7);
        System.out.println(arrayList);
        int sum = 0;
        for (int i = 0 ; i < arrayList.size() ; i++){
            sum = sum + arrayList.get(i);

        }
        System.out.println(sum);
    }

public void myMainMethod2(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size : " );
    int size = sc.nextInt();
    ArrayList<Integer> al = new ArrayList<>();
    System.out.println("Enter the values : ");
    for (int i = 0 ; i < size ; i++) {
        al.add(sc.nextInt());
    }
    System.out.println(al);

    int sum = 0 ;
    for (int i = 0 ; i < al.size() ; i++){
       sum = sum + al.get(i);
    }
    System.out.println("sum of the numbers is " + sum);
}
public static void main(String[] args){
    ListPractice1 listPractice = new ListPractice1();
   // listPractice.myMainMethod();
    listPractice.myMainMethod2();
}

}
