package com.practiceJava.collectionsPractice;

import com.practiceJava.models.Addresses;
import com.practiceJava.models.Employee;
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
    //[1:[[houseNumber]],2:[[houseNumber]],3:[[houseNumber]]]
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

    //{1:[addresOject1,addressObject2],2:[addresOject1,addressObject2]}
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
    public void myMainMethod(){
        ArrayList<Employee> employeeArrayList = creatingEmployees();
        gettingAddress(employeeArrayList);
       Map<Integer ,ArrayList<Addresses>> arrayListMap = usingMap(employeeArrayList);
       updatingState(arrayListMap);
    }
    public static void main(String[] args){
        ListPractice9 object = new ListPractice9();
        object.myMainMethod();
    }
}
