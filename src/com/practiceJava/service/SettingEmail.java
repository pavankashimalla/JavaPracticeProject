package com.practiceJava.service;

import com.practiceJava.models.Employee;
import com.practiceJava.models.Addresses;
import com.practiceJava.models.EmployeeCompany;

import java.time.LocalDate;
import java.util.ArrayList;
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
   // employeeObject1.setCompany("java");
    ArrayList<EmployeeCompany> employeeCompanyArrayList = new ArrayList<>();
    LocalDate company1StatingDate = LocalDate.of(2021,5,19);
    LocalDate company1EndingDate = LocalDate.of(2023,1,29);
    EmployeeCompany emp1Company1 = preparingEmployeeCompany(787,"waffles",120,"jhon","developer",company1StatingDate,company1EndingDate,2);
    LocalDate company2StartingDate = LocalDate.of(2023,1,29);
    LocalDate company2EndingDate = LocalDate.of(2023,9,29);
    EmployeeCompany emp1Company2 = preparingEmployeeCompany(609,"milton",190,"rashid","developer",company2StartingDate,company2EndingDate,1);
    employeeCompanyArrayList.add(emp1Company1);
    employeeCompanyArrayList.add(emp1Company2);
    employeeObject1.setEmployeeCompanyArrayList(employeeCompanyArrayList);

    employeeObject1.setSalary(10000);
    Addresses emp1Address1 = preparingAddress("road5" ,"9-0-88" , " ts " , "kmm" ,90087);
    //employeeObject1.setAddresses(address1);
    ArrayList<Addresses> addressesArrayList = new ArrayList<>();
    Addresses emp1Address2 = preparingAddress("road 6" , "0-8-9" , "ts" ,"kmm" , 56008);
    addressesArrayList.add(emp1Address1);
    addressesArrayList.add(emp1Address2);
    employeeObject1.setAddressesArrayList(addressesArrayList);



    Employee employeeObject2 = new Employee();
    employeeObject2.setId(2);
    employeeObject2.setFirstName("praveen");
    employeeObject2.setLastName("s");
   // employeeObject2.setCompany("python");
    ArrayList<EmployeeCompany> employeeCompanyArrayList2 = new ArrayList<>();
    LocalDate emp2company1StartingDate = LocalDate.of(2019,9,29);
    LocalDate emp2company1EndingDate = LocalDate.of(2021,9,20);
    LocalDate emp2company2StartingDate = LocalDate.of(2022,6,29);
    LocalDate emp2company2EndingDate = LocalDate.of(2023,9,19);
    EmployeeCompany emp2Company1 = preparingEmployeeCompany(687,"homble",200,"kanni","analyst",emp2company1StartingDate,emp2company1EndingDate,1);
    EmployeeCompany emp2Company2 = preparingEmployeeCompany(60998,"factory",90,"dhani","analyst",emp2company2StartingDate,emp2company2EndingDate,2);
    employeeCompanyArrayList2.add(emp2Company1);
    employeeCompanyArrayList2.add(emp2Company2);
    employeeObject2.setEmployeeCompanyArrayList(employeeCompanyArrayList2);

    employeeObject2.setSalary(24000);
    Addresses emp2Address1 = preparingAddress("fastRoad" ,"4-8-4","AP","vij",70089);
   // employeeObject2.setAddresses(address2);
    ArrayList<Addresses> addressesArrayList1 = new ArrayList<>();
    Addresses emp2Address2 = preparingAddress("fastRoad2" ,"9-7-2", "mp","vij",70097);
    addressesArrayList1.add(emp2Address1);
    addressesArrayList1.add(emp2Address2);
    employeeObject2.setAddressesArrayList(addressesArrayList1);


    Employee employeeObject3 = new Employee();
    employeeObject3.setId(3);
    employeeObject3.setFirstName("naveen");
    employeeObject3.setLastName("m");
   // employeeObject3.setCompany("sql");
    ArrayList<EmployeeCompany> employeeCompanyArrayList3 = new ArrayList<>();
    LocalDate emp3company1StaringDate = LocalDate.of(2019,4,12);
    LocalDate emp3Company1EndingDate = LocalDate.of(2022,5,20);
    LocalDate emp3company2StartingDate = LocalDate.of(2022,7,9);
    LocalDate emp3company2EndingDate = LocalDate.of(2023,9,29);
    EmployeeCompany emp3Company1 = preparingEmployeeCompany(206 ,"global",54 , "raja" ,"developer",emp3company1StaringDate,emp3Company1EndingDate,3);
    EmployeeCompany emp3Company2 = preparingEmployeeCompany(980,"optimize",67,"kumar","developer",emp3company2StartingDate,emp3company2EndingDate,1);
    employeeCompanyArrayList3.add(emp3Company1);
    employeeCompanyArrayList3.add(emp3Company2);
    employeeObject3.setEmployeeCompanyArrayList(employeeCompanyArrayList3);

    employeeObject3.setSalary(46000);
    Addresses emp3Address1 = preparingAddress("lastN","28-9-0","Ap","ellur",60902);
   // employeeObject3.setAddresses(address3);
    ArrayList<Addresses> addressesArrayList2 = new ArrayList<>();
    Addresses emp3Address2 = preparingAddress("lastn1","37-3-0","up","kmm",600987);
    addressesArrayList2.add(emp3Address1);
    addressesArrayList2.add(emp3Address2);
    employeeObject3.setAddressesArrayList(addressesArrayList2);

    Employee[] employees = new Employee[3];
    employees[0] = employeeObject1;
    employees[1] = employeeObject2;
    employees[2] = employeeObject3;

    return employees;

}
public Addresses preparingAddress(String roadName , String houseNumber , String state , String city , int pincode){
    Addresses addressObject = new Addresses();
    addressObject.setRoadName(roadName);
    addressObject.setHouseNumber(houseNumber);
    addressObject.setState(state);
    addressObject.setCity(city);
    addressObject.setPinCode(pincode);


    return addressObject;
}
public EmployeeCompany preparingEmployeeCompany (int companyId , String companyName , int totalEmployees , String companyCeo , String designation , LocalDate startingDate , LocalDate endingDate , int totalYearOfExperience){
    EmployeeCompany employeeCompanyObject = new EmployeeCompany();
    employeeCompanyObject.setCompanyId(companyId);
    employeeCompanyObject.setCompanyName(companyName);
    employeeCompanyObject.setTotalEmployees(totalEmployees);
    employeeCompanyObject.setCompanyCeo(companyCeo);
    employeeCompanyObject.setDesignation(designation);
    employeeCompanyObject.setStartingDate(startingDate);
    employeeCompanyObject.setEndDate(endingDate);
    employeeCompanyObject.setTotalYearOfExperience(totalYearOfExperience);

    return employeeCompanyObject;

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
  public void myMainMethod(){
      Employee[] employeesArray = prepareData();
      updateEmail(employeesArray);
      updateSalary(employeesArray);
      printEmployeeDetails(employeesArray);


      //prepare data
      //upadate emailid
      //print email ids
  }
    public static void main(String[] args) {
        SettingEmail sc = new SettingEmail();
        sc.myMainMethod();
    }
}
