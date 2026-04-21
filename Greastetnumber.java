
package com.mycompany.greastetnumber;

import java.util.Scanner;

public class Greastetnumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        if (num1 > num2 && num1 > num3){
            System.out.println("The" +num1+ "is grather than all!");
        }
        else if (num2>num1 && num2 > num3){
            System.out.println("The" +num2+ "is grather than all!");
            
        }
        else{
            System.out.println("The" +num3+ "is grather than all!");
        }
    }
}
