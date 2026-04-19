
package com.mycompany.convertingtemperatures;

import java.util.Scanner;

public class ConvertingTemperatures {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
// This program will convert the digree of tempeature

System.out.println("Inter the digree in Fahrenheit: ");

double Fahrenheit = input.nextDouble();

double Celius = (5.0/9)*(Fahrenheit - 32);
        System.out.println("The degree in Celius is :"+Celius);

        
       
                
    }
}
