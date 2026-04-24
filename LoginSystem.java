
package com.mycompany.loginsystem;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);
    
    String name = "admin";
    
    int password = 1234;
    
        System.out.println("Enter your name:");
        
        String input_name = input.next();
        
        System.out.println("Enter your password:");
        
        int input_password = input.nextInt();
        
        if ( input_name.equals(name)  && input_password == password){
            
            System.out.println("Welcome!");
        }
        else if(input_name.equals(name) && password != input_password){
        
            System.out.println("Your password is incorrect!");
        }
        
        else if ( !input_name.equals(name) && password == input_password){
        
            System.out.println("Your name is incorrect!");
        }
        else{
        
            System.out.println("Your password and name are boht incorrect!");
        }
        
        
    }
}
