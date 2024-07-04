package com.practiceJava.models;

public class Addresses {
    public String roadName;

    public String houseNumber;

    public String state;

    public String city;

    public int pinCode;

    public String toString(){
        return this.city + "=" + this.state;
    }

    public boolean equals(Object object){
        Employee e = (Employee) object;
        if (e.getId().equals(this.houseNumber)){
            return true;
        }else {
            return false;
        }
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
