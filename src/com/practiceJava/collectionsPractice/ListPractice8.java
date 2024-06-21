package com.practiceJava.collectionsPractice;

import com.practiceJava.models.Employee;
import com.practiceJava.service.SettingEmail;

import java.util.*;

public class ListPractice8 {
    //{[1:employeeObject] }
    public Map<Integer , Employee> creatingEmployees(){
        Map<Integer , Employee> employeeMap = new HashMap<>();
        SettingEmail settingEmail = new SettingEmail();
      Employee[] employeesArray = settingEmail.prepareData();
        for (int i = 0 ; i < employeesArray.length ; i++){
          Employee object = employeesArray[i];
         int id = object.getId();
          employeeMap.put(id , object);
        }
        return employeeMap;
    }
    //{[]}
    public void usingList(Map<Integer , Employee> employeeMap){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for (Map.Entry<Integer , Employee> employeeEntry : employeeMap.entrySet()){
          Employee employee = employeeEntry.getValue();
          employeeArrayList.add(employee);

        }
        System.out.println(employeeArrayList);
    }
    public void usingSet(Map<Integer , Employee> employeeMap){
        Set<Employee> employeeSet = new HashSet<>();
        for (Map.Entry<Integer , Employee> employeeEntry : employeeMap.entrySet()){
           Employee employee = employeeEntry.getValue();
           employeeSet.add(employee);
        }
        System.out.println(employeeSet);
    }
//
    public void updatingSalary(Map<Integer , Employee> employeeMap){
        for (Map.Entry<Integer , Employee> employeeEntry : employeeMap.entrySet()){
          Employee employee = employeeEntry.getValue();
         int originalSalary = employee.getSalary();
         int updatedSalary = originalSalary + 50000;
         employee.setSalary(updatedSalary);
        }
    }

    public void myMainMethod(){
      Map<Integer , Employee> employeeMap = creatingEmployees();
      usingList(employeeMap);
      usingSet(employeeMap);
      updatingSalary(employeeMap);
    }
    public static void main(String[] args){
        ListPractice8 object = new ListPractice8();
        object.myMainMethod();
    }
}
