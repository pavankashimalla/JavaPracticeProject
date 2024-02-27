package com.practiceJava;
import java.util.Scanner;
public class StudentGrading {
    public void initiateGrading(){
        AuthenticationService authenticationServiceObject = new AuthenticationService("pavan@123","kumar123");
        boolean authenticationStatus = authenticationServiceObject.initiateAuthenticate();
        if (authenticationStatus){
            readMarksFromUserAndPrintGrade();
        }
        else {
            System.out.println("Wrong details - please enter correct details");
        }

    }
      public void readMarksFromUserAndPrintGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks ");
        int inputNumberFromUSer = scanner.nextInt();
        printGrade(inputNumberFromUSer);

    }
    public void printGrade(int number) {

        if (number > 75 && number <=100) {
            System.out.println("you got the distinction marks");
        }else if (number >= 60 && number < 75 ){
            System.out.println("you got the 1st class marks");
        }else if (number >= 36 && number < 60){
            System.out.println("you got 2nd class marks");
        }else {
            System.out.println("you are failed in the exam");
        }

    }
    public void marksGradeSwitch(int i){
        switch ( i/10 ){
            case 1:
                System.out.println("you got 'A' Grade");
                break;
            case 2:
                System.out.println("you got 'B' Grade");
                break;
            case 3:
                System.out.println("you got 'C' Grade");
                break;
            case 4:
                System.out.println("you got 'D' Grade");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("you got 'F' Grade");
                break;
            default:
                System.out.println("This is invalid number");
                break;
        }


    }

    public static void main (String[] args){
        StudentGrading object2 = new StudentGrading();
        object2.initiateGrading();
    }

}
