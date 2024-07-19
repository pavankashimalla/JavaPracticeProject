package com.practiceJava.collectionsPractice;

import com.practiceJava.models.Addresses;
import com.practiceJava.models.Employee;
import com.practiceJava.models.EmployeeCompany;
import com.practiceJava.service.SettingEmail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListPractice9 {
    //[[employeeObject]     ]
    public ArrayList<Employee> creatingEmployees(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        SettingEmail settingEmail = new SettingEmail();
      Employee[] employees = settingEmail.prepareData();
            for (int i = 0 ; i < employees.length ; i++){

                Employee employeeObject = employees[i];
                employeeArrayList.add(employeeObject);
            }
        return employeeArrayList;
    }
    //[1:[houseNumber],2:[houseNumber],3:[houseNumber]]
    public void gettingAddress(ArrayList<Employee> employeeArrayList){
        for (int i = 0 ; i < employeeArrayList.size() ; i++){

           Employee employeeObject = employeeArrayList.get(i);
           String firstName = employeeObject.getFirstName();
           ArrayList<Addresses> addressesArrayList = employeeObject.getAddressesArrayList();
           for (int j = 0 ; j < addressesArrayList.size() ; j++){
                Addresses addressObject = addressesArrayList.get(j);
                String houseNumber = addressObject.getHouseNumber();
                System.out.println(firstName + " house " + " number " + " is " + houseNumber);
            }
            System.out.println("_______________________________________");
        }
    }
        //{[1=[address1,address2] , 2=[address1,address2] , 3=[address1,address2]]}
    public Map<Integer , ArrayList<Addresses>> usingMap(ArrayList<Employee> employeeArrayList){
        Map<Integer , ArrayList<Addresses> > arrayListHashMap = new HashMap<>();
        for (int i = 0 ; i < employeeArrayList.size() ; i++){
          Employee employee = employeeArrayList.get(i);
          int employeeId = employee.getId();
          arrayListHashMap.put(employeeId , employee.getAddressesArrayList());

        }
        System.out.println(arrayListHashMap);
             return arrayListHashMap;

    }

    //{1:[addressObject1,addressObject2],2:[addressObject1,addressObject2]}
    public void updatingState(Map<Integer , ArrayList<Addresses>> arrayListMap){
        for (Map.Entry<Integer , ArrayList<Addresses>> arrayListEntry : arrayListMap.entrySet()){
          ArrayList<Addresses> addresses = arrayListEntry.getValue();
                for (int i = 0 ; i < addresses.size() ; i++){
                  Addresses address = addresses.get(i);
                  address.setState("Telangana");
                }
            System.out.println(addresses);
        }
    }
    public void updatingPersonsState(Map<Integer , ArrayList<Addresses>> arrayListMap, int employeeId, String state){

        for (Map.Entry<Integer , ArrayList<Addresses>> arrayListEntry : arrayListMap.entrySet()){
          int id = arrayListEntry.getKey();
          if (id == employeeId) {
              ArrayList<Addresses> addressesArrayList = arrayListEntry.getValue();
              for (int i = 0 ; i < addressesArrayList.size() ; i++){
                Addresses addresses = addressesArrayList.get(i);
                addresses.setState(state);
                  System.out.println(addresses);
              }
          }
        }
    }
    public void gettingCompanyDetails(ArrayList<Employee> employeeArrayList){
        for (int i = 0 ; i < employeeArrayList.size(); i++){
          Employee employeeObject = employeeArrayList.get(i);
          String firstName = employeeObject.getFirstName();
        ArrayList<EmployeeCompany> employeeCompanyArrayList = employeeObject.getEmployeeCompanyArrayList();
         for (int j = 0 ; j < employeeCompanyArrayList.size() ; j++){
              EmployeeCompany employeeCompany = employeeCompanyArrayList.get(j);
             String companyName = employeeCompany.getCompanyName();
           int experience = employeeCompany.getTotalYearOfExperience();
             System.out.println(firstName + " company " + " name " + " is " + companyName + " Experience is " + experience);
         }
            System.out.println("---------------------------------");
        }
    }
    public Map<Integer,ArrayList<EmployeeCompany>> arrayListToMap (ArrayList<Employee> employeeArrayList){
        Map<Integer , ArrayList<EmployeeCompany>> arrayListMap = new HashMap<>();
        for (int i = 0 ; i < employeeArrayList.size() ; i++){
          Employee employee = employeeArrayList.get(i);

          int employeeId = employee.getId();
          arrayListMap.put(employeeId , employee.getEmployeeCompanyArrayList());
            System.out.println(employee);
            boolean bool = employee.equals(employee);
            System.out.println(bool);
        }


        System.out.println(arrayListMap);
        return arrayListMap;
    }

    public void myMainMethod(){
        ArrayList<Employee> employeeArrayList = creatingEmployees();
        gettingAddress(employeeArrayList);
       Map<Integer ,ArrayList<Addresses>> arrayListMap = usingMap(employeeArrayList);
       updatingState(arrayListMap);
       int employeeId = 2;
       String state = "odisha";
       updatingPersonsState(arrayListMap , employeeId , state);
       gettingCompanyDetails(employeeArrayList);
       arrayListToMap(employeeArrayList);
    }
    public static void main(String[] args){
      //  ListPractice9 object = new ListPractice9();
      //  object.myMainMethod();
        new ListPractice9().myMainMethod();
    }

}
