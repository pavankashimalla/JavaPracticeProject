package com.practiceJava;

import java.util.Scanner;

public class AuthenticationService {
    private String useNameGlobal ;
    private  String passwordGlobal ;

    public AuthenticationService(String inputUserName, String inputPassword){
        useNameGlobal = inputUserName;
        passwordGlobal = inputPassword;
    }

    public boolean initiateAuthenticate(){
        boolean result =false;

        int counter = 1;
        //not false = true
        while(!result && counter <= 5){
            Scanner scannerObject = new Scanner(System.in);
            System.out.println("Enter the userName : ");
            String user = scannerObject.nextLine();
            System.out.println("Enter the password : ");
            String password = scannerObject.nextLine();
            result = authenticate(user , password);
            counter ++;
        }

        return result;
    }
    public boolean forEach(){
        boolean result = false;
       //if ( result = false){


            int counter = 1;
            for ( ;!result && counter <= 5;counter ++) {
                Scanner scannerObject = new Scanner(System.in);
                System.out.println("Enter the userName : ");
                String user = scannerObject.nextLine();
                System.out.println("Enter the password : ");
                String password = scannerObject.nextLine();
                result = authenticate(user, password);
            }
        //}
      // else {
          // result = true;
      //  }
        return result;
    }
    public boolean authenticate(String userName , String password){
        if (userName.equals(useNameGlobal) && password.equals(passwordGlobal)){
            return true;
        }
        else {
            return false;
        }
    }
}
