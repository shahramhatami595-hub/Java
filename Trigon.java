
package com.mycompany.trigon;
import java.util.Scanner;
public class Trigon {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Enter three degree: ");
        double degA = input.nextDouble();
        double degB = input.nextDouble();
        double degC = input.nextDouble();
        
        if(degA + degB > degC && degA + degC > degB && degB + degC > degA){
        
            System.out.println("Vailid degree ok!");
        }
        else{
            System.out.println("Invalid degree!!");
        }
        
        
        
    }
}
