package com.practiceJava.encapsulation;

public class Teacher {
    public static void main(String[] args) {
        Student student = new Student(62);

        student.setStudentAttended(true);
        student.getStudentAttendance();

    }
}
