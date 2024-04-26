package com.practiceJava.service;

import com.practiceJava.models.Employee;

import java.util.Scanner;

public class SettingEmail {
public Employee[] prepareData(){
   /* Employee employeeObject1 = new Employee();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the employee1 id ");
    int idFromUser = sc.nextInt();
    employeeObject1.setId(idFromUser);
    System.out.println("Enter the firstName ");
    String firstName = sc.next();
    employeeObject1.setFirstName(firstName);
    System.out.println("Enter the lastName ");
    String lastName = sc.next();
    employeeObject1.setLastName(lastName);
    System.out.println("Enter the company ");
    String company = sc.next();
    employeeObject1.setCompany(company);*/



    Employee employeeObject1 = new Employee();
    employeeObject1.setId(1);
    employeeObject1.setFirstName("pavan");
    employeeObject1.setLastName("k");
    employeeObject1.setCompany("java");
    employeeObject1.setSalary(10000);


    Employee employeeObject2 = new Employee();
    employeeObject2.setId(2);
    employeeObject2.setFirstName("praveen");
    employeeObject2.setLastName("s");
    employeeObject2.setCompany("python");
    employeeObject2.setSalary(24000);


    Employee employeeObject3 = new Employee();
    employeeObject3.setId(3);
    employeeObject3.setFirstName("naveen");
    employeeObject3.setLastName("m");
    employeeObject3.setCompany("sql");
    employeeObject3.setSalary(46000);

    Employee[] employees = new Employee[3];
    employees[0] = employeeObject1;
    employees[1] = employeeObject2;
    employees[2] = employeeObject3;

    return employees;

}
public void updateEmail(Employee[] employees){
    for (int i = 0 ; i < employees.length ; i++){
        Employee employeeObject = employees[i];

      String firstName = employeeObject.getFirstName();
      String lastName = employeeObject.getLastName();
      String company = employeeObject.getCompany();


      //firstName.lastName @company.com
      String email = firstName + "." + lastName + "@" + company + ".com";

        employeeObject.setEmail(email);
    }
}
public void updateSalary(Employee[] employees){
    for (int i = 0 ; i < employees.length ; i++){
        Employee employeeObject = employees[i];

        int originalSalary = employeeObject.getSalary();
        //System.out.println(originalSalary);
        int updateSalary = originalSalary + 4000;

        employeeObject.setSalary(updateSalary);
    }
}
public void printEmployeeDetails(Employee[] employees){
    for (int i = 0 ; i < employees.length ; i++){
       Employee employeeObject = employees[i];
     String emailid = employeeObject.getEmail();
     String firstName = employeeObject.getFirstName();

     int salary = employeeObject.getSalary();
       //emailid of first name is emailid , salary is updateSalary;
        System.out.println("Email id of " + firstName + " is " + emailid + " and " + " salary " + " is " + salary);
    }

}
  public void myMainMethod(SettingEmail sc){
      Employee[] employeesArray = sc.prepareData();
      sc.updateEmail(employeesArray);
      sc.updateSalary(employeesArray);
      sc.printEmployeeDetails(employeesArray);


      //prepare data
      //upadate emailid
      //print emain ids
  }
    public static void main(String[] args) {
        SettingEmail sc = new SettingEmail();
        sc.myMainMethod(sc);
    }
}
