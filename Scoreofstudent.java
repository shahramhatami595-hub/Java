
package com.mycompany.scoreofstudent;

import java.util.Scanner;

public class Scoreofstudent {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
        System.out.println("Enter your score:");
        
        float score = input.nextFloat();
        
        if(score > 100){
        
            System.out.println("Invalid input enter again!");
        }
        else if(score >= 90){
        
            System.out.println("Your rank is 'A'");
        }
        
        else if(score >= 80){
        
            System.out.println("Your rank is 'B'");
        }
        
        else if(score >= 70){
        
            System.out.println("Your rank is 'C'");
        }
        
        else if (score >= 60 ){
        
            System.out.println("Your rank is 'D'");
        }
        
        else {System.out.println("Your rank is 'E' you should give the exaim again!");}
        
    }
}
