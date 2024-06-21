package com.practiceJava.collectionsPractice;
import com.practiceJava.models.Addresses;
import com.practiceJava.models.Employee;
import com.practiceJava.service.SettingEmail;

import java.util.*;
public class ListPractice6 {
    public ArrayList<Employee> creatingEmployees(){


     /*   Employee employeeObject1 = new Employee();
        employeeObject1.setId(101);
        employeeObject1.setFirstName("pavan");
        employeeObject1.setLastName("kumar");
        employeeObject1.setCompany("info");
        employeeObject1.setSalary(10000);

        Employee employeeObject2 = new Employee();
        employeeObject2.setId(102);
        employeeObject2.setFirstName("naveen");
        employeeObject2.setLastName("kumar");
        employeeObject2.setCompany("infogain");
        employeeObject2.setSalary(20000);

        Employee employeeObject3 = new Employee();
        employeeObject3.setId(103);
        employeeObject3.setFirstName("praveen");
        employeeObject3.setLastName("kumar");
        employeeObject3.setCompany("infosys");
        employeeObject3.setSalary(30000);*/

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        SettingEmail settingEmail = new SettingEmail();
        Employee[] employeesArray = settingEmail.prepareData();
        for (int i =0 ; i < employeesArray.length ; i++){
          Employee object = employeesArray[i];
          employeeArrayList.add(object);
        }

      /*  employeeArrayList.add(employeeObject1);
        employeeArrayList.add(employeeObject2);
        employeeArrayList.add(employeeObject3);*/

        return employeeArrayList;

    }
    public void updateEmails(ArrayList<Employee> employees){
    for (int i = 0 ; i < employees.size() ; i++){
          Employee employeeObject = employees.get(i);

         String firstName = employeeObject.getFirstName();
         String lastName = employeeObject.getLastName();
         String company = employeeObject.getCompany();

       String email = firstName + "." + lastName + "@" + company + ".com";
       employeeObject.setEmail(email);
    }

    }
    public void updateSalary(ArrayList<Employee> employees){
        for (int i = 0 ; i < employees.size() ; i++){
            Employee employeeObject = employees.get(i);

         int originalSalary = employeeObject.getSalary();
       int updateSalary = originalSalary + 5000;

       employeeObject.setSalary(updateSalary);
        }
    }
    public void printEmployeeDetails(ArrayList<Employee> employees){
        for (int i = 0 ; i < employees.size() ; i++){
            Employee employeeObject = employees.get(i);
           String firstName = employeeObject.getFirstName();
         String emailId = employeeObject.getEmail();
        int salary = employeeObject.getSalary();
        System.out.println("Email id of " + firstName + " is " + emailId + " and " + " salary " + " is " + salary);
        }
    }

    public void usingMap(ArrayList<Employee> employeesList){
        Map<Integer , Employee> employeeMap = new HashMap<>();
        for (int i = 0 ; i < employeesList.size() ; i++){
          Employee employeeObject = employeesList.get(i);
         int id = employeeObject.getId();
         employeeMap.put(id , employeeObject);
        }
        System.out.println(employeeMap);

    }


    public void myMainMethod(){
    ArrayList<Employee> employeeArrayList = creatingEmployees();
    updateEmails(employeeArrayList);
    updateSalary(employeeArrayList);
    printEmployeeDetails(employeeArrayList);
    usingMap(employeeArrayList);
    }
    public static void main(String[] args){
        ListPractice6 object = new ListPractice6();
        object.myMainMethod();
    }
}
