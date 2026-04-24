
package com.mycompany.loginsecurity;

import java.util.Scanner;

public class LoginSecurity {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
 
    System.out.println("Make a password for your device!");
        
    String password  = input.next();
    
    if (password.length() < 5 ){
        
        System.out.println("Your password is too weak!");
    
    }
    else if(password.length() == 5 ){
 
        System.out.println("Your password is middle!!");

    }
    else {
    
        System.out.println("Your password is too strong!");
        
    }    
        
    if (password.equals("12345")){
    
        System.out.println("This password is too weak and common!");
    }
    
    
    }
}
