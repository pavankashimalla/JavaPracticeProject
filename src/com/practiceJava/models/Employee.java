package com.practiceJava.models;


import java.util.ArrayList;

public class Employee {
    public Integer id;
    public String firstName;
    public String lastName;
    public String company;
    public String email;
    public int salary;

    public String toString() {
        return this.id + " = " + this.firstName ;
    }

    public boolean equals(Object object1){

        Employee e = (Employee) object1;
        //Integer intId = e.getId();
        if (e.getId().equals(this.getId())){
            return true;
        }else {
            return false;
        }

    }

    public ArrayList<EmployeeCompany> employeeCompanyArrayList;

    public ArrayList<EmployeeCompany> getEmployeeCompanyArrayList() {
        return employeeCompanyArrayList;
    }

    public void setEmployeeCompanyArrayList(ArrayList<EmployeeCompany> employeeCompanyArrayList) {
        this.employeeCompanyArrayList = employeeCompanyArrayList;
    }

    public Addresses addresses;

    public ArrayList<Addresses> addressesArrayList ;

    public ArrayList<Addresses> getAddressesArrayList() {
        return addressesArrayList;
    }

    public void setAddressesArrayList(ArrayList<Addresses> addressesArrayList) {
        this.addressesArrayList = addressesArrayList;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




}
