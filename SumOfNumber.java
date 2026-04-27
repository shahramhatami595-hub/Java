
package com.mycompany.sumofnumber;

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number ;
        do{
            System.out.println("Enter an integer:");
            
            number = input.nextInt();
            
            sum += number;
        
        
        }while(number != 0);
        
        System.out.println("The sum of the numbers are:"+sum);
    }
}
