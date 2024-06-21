package com.practiceJava.collectionsPractice;

import com.practiceJava.models.Employee;
import com.practiceJava.service.SettingEmail;

import java.util.*;

public class ListPractice7 {

    public Set<Employee> creatingEmployees(){
        Set<Employee> employeeSet = new HashSet<>();
        SettingEmail settingEmail = new SettingEmail();
      Employee[] employeesArray = settingEmail.prepareData();
      for (int i = 0 ; i < employeesArray.length ; i++){
          Employee object = employeesArray[i];
          employeeSet.add(object);
      }
     // System.out.println(employeeSet);
       return employeeSet;
    }
    public void updatingEmail(Set<Employee> employeeSet){
    for (Employee employee : employeeSet){
        String firstName = employee.getFirstName();
        String lastName = employee.getLastName();
        String company = employee.getCompany();

        String emailId = firstName + "." + lastName + "@" + company + ".com";
        employee.setEmail(emailId);
    }
    }
    public void updateSalary(Set<Employee> employeeSet){
        for (Employee employee : employeeSet){
          int originalSalary = employee.getSalary();
          int updatedSalary = originalSalary + 6000;

          employee.setSalary(updatedSalary);
        }
    }
    public void printEmployeeDetails(Set<Employee> employeeSet){
        for (Employee employee : employeeSet){
          String firstName = employee.getFirstName();
          String emailId = employee.getEmail();
        int salary = employee.getSalary();
        System.out.println("Email id of " + firstName + " is " + emailId + " and " + " salary is " + salary);
        }
    }
    public ArrayList<Employee> usingArrayList(Set<Employee> employeeSet){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for (Employee employee : employeeSet){
            employeeArrayList.add(employee);

        }
        System.out.println(employeeArrayList);
        return employeeArrayList;
    }
    public Map<String , Employee> usingMap(Set<Employee> employeeSet){
        Map<String , Employee> employeeMap = new HashMap<>();
        for (Employee employee : employeeSet){
          String email = employee.getEmail();
          employeeMap.put(email , employee);
        }
        System.out.println(employeeMap);
        return employeeMap;
    }
    public void myMainMethod(){
        Set<Employee> employeeSet = creatingEmployees();
        updatingEmail(employeeSet);
        updateSalary(employeeSet);
        printEmployeeDetails(employeeSet);
        usingArrayList(employeeSet);
        usingMap(employeeSet);

    }
    public static void main(String[] args){
        ListPractice7 object = new ListPractice7();
        object.myMainMethod();
    }
}
