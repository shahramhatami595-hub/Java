
package com.mycompany.circleinmethod;

import java.util.Scanner;

public class Circleinmethod {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the redius:");
        
        double redius = input.nextDouble();
     
        System.out.println(circle(redius));
    }
   static double circle(double redius){
       
return redius * redius * 3.14;
       
   }
}
