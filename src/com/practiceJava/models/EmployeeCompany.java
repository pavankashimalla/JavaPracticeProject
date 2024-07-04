package com.practiceJava.models;

import java.time.LocalDate;

public class EmployeeCompany extends Company{

    public LocalDate startingDate;

    public LocalDate endDate;

    public String designation;

    public boolean equals(Object object){
        Employee e = (Employee) object;
        if (e.getEmployeeCompanyArrayList().equals(this.getTotalYearOfExperience())){
            return true;
        }else {
            return false;
        }
    }

    public String toString(){
        return this.startingDate + " = " + this.endDate  ;
    }


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public int totalYearOfExperience;

    public int getTotalYearOfExperience() {
        return totalYearOfExperience;
    }

    public void setTotalYearOfExperience(int totalYearOfExperience) {
        this.totalYearOfExperience = totalYearOfExperience;
    }
}
