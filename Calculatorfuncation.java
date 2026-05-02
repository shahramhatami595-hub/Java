
package com.mycompany.calculatorfuncation;

import java.util.Scanner;

public class Calculatorfuncation {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number for doing operation:");
        int x = input.nextInt();
        System.out.println("Enter the secound number for doing operation:");
        int y  = input.nextInt();
        System.out.print("\n");
        
        System.out.println( "The sum of the number is: "+sum(x,y));
        
        System.out.println("The substraction of the number is: "+ subtract(x,y));
        
        System.out.println("The multiplication of the number is: "+ multiply(x,y));
        
        System.out.println("The division of the number is: "+ divide(x,y));
    
    }
    
    static int sum(int i, int j){
    
    return i + j;
    
    }
    
    static int subtract(int i, int j){
    
    return i - j;
    
    }
    static int multiply(int i, int j){
    
    return i * j;
    
    }
    
    static double divide (double i, double j){
        if (j == 0){
        
            System.out.println("Cant divide by zero!");
           return 0;
        }
        return i/j;
    
    }
    
}
