
package com.mycompany.factroil;
import java.util.Scanner;
public class Factroil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long factroial = 1;
        System.out.println("Enter a number:");
        int number = input.nextInt();
        for(int i = 1;i <= number;i++){
        factroial *= i;
            
        }
        System.out.println("The factroial of "+number+" is: "+factroial);
        
    }
}
