package com.practiceJava.encapsulation;

public class Student {
private int rollNumber;
private String name;
private boolean isAttended;

public Student(int rollNumber){
    this.rollNumber = rollNumber;
System.out.println(rollNumber);
}
public void setStudentAttended(boolean attendedStatus){
isAttended = attendedStatus;
System.out.println("Teacher assigned student attendance");
}
public boolean getStudentAttendance(){
System.out.println("Teacher accessed student attendance");
    return isAttended;
}
}
