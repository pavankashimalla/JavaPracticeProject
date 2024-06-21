package com.practiceJava.collectionsPractice;
import java.util.*;
public class ListPractice5 {

    public Map<Integer,String> creatingEmployees(){
        Scanner sc = new Scanner(System.in);
        Map<Integer , String> map = new HashMap<>();
        System.out.println("Enter the employees : ");
        for (int i = 0 ; i < 3 ; i++){
            map.put(sc.nextInt() , sc.next());
        }
        //System.out.println(map);
        return map;
    }
    public void updatingEmployees(Map map){
       map.replace(1 ,"kanni");
        System.out.println(map);
    }
    public void removingEmployee(Map map){
        System.out.println(map);
        map.remove(123);
        System.out.println(map);
    }

    public void myMainMethod(){
     Map<Integer,String> employeeList = creatingEmployees();
     updatingEmployees(employeeList);
     removingEmployee(employeeList);
    }
    public static void main(String[] args){
        ListPractice5 object = new ListPractice5();
        object.myMainMethod();
    }
}
