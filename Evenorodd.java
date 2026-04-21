
package com.mycompany.operator;
import java.util.Scanner;
public class Operator {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
    int number = input.nextInt();
    if(number ==0){
        System.out.println("The number is zero");
        
    }
    else if(number % 2 == 0){
        System.out.println("The number is even");
    }
    
    else 
            System.out.println("The number is odd");
    
    }
}
