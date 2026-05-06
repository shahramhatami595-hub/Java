
package com.mycompany.analyzingnumbers;

import java.util.Scanner;

public class Analyzingnumbers {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the numbers of item: ");
        
        int items = input.nextInt();
        
        int [] numbers = new int[items];
        
        double sum = 0;
        for (int i = 0;i<numbers.length;i++){
            System.out.println("Enter the number:  ");
            
            numbers[i] = input.nextInt();
            
            sum += numbers[i];
            
        }
        double avg = (sum/items);
        int counter = 0;
        
        for (int i = 0;i<items;i++){
        
        if (numbers[i]>avg){
        
        counter++;
        
        
        }
        
        
        }
        System.out.println("The sum of the numbers are: "+sum);
        System.out.println("Average is: "+avg);
        System.out.println("The numbers of element above is avgrage is: "+counter);
        
    }
}
