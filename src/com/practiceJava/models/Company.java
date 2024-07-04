package com.practiceJava.models;

public class Company {

    public int companyId ;

   public String companyName;

   public int totalEmployees;

    public String companyCeo;

    public String toString(){
        return this.companyId + "=" + this.companyCeo;
    }
    public boolean equals(Object object){
        Employee e = (Employee) object;
        if (e.getId().equals(this.getCompanyId())){
            return true;
        }else {
            return false;
        }
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompanyCeo() {
        return companyCeo;
    }

    public void setCompanyCeo(String companyCeo) {
        this.companyCeo = companyCeo;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String location;

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


}
