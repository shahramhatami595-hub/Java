
package com.mycompany.guessingnumber;

import java.util.Scanner;

public class GuessingNumber {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    int target_number  = 78;
    
    int upper_20 = target_number + 20;
    int lower_20 = target_number -20;
     
        System.out.println("Enter a number between 1 and 100:");
        
        int guessing_number = input.nextInt();
        
        if(guessing_number == target_number){
            
            System.out.println("Congrateulate you won!");
        }
        else if(guessing_number > upper_20){
            System.out.println("Too high come down!");
        
        }
        else if(guessing_number < lower_20){
            
            System.out.println("Too low go up!!");
        
        }
        else {
        
            System.out.println("It is wrong!!");
        }
    
    }
}
