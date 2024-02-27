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
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the userName : ");
        String user = scannerObject.nextLine();
        System.out.println("Enter the password : ");
        String password = scannerObject.nextLine();
        boolean result = authenticate(user , password);
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
