
package com.mycompany.reversnumber;

import java.util.Scanner;

public class Reversnumber {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter a number:");
        
        int number = input.nextInt();
        
        System.out.println("The revers of "+number+" is:");
        
       for (int x = number;x>= 0;x--){
       
           System.out.println(x);
       } 
        
       
    }
}
