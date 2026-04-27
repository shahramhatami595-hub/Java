
package com.mycompany.oddnumberbetweenendstart;
import java.util.Scanner;

public class OddNumberBetweenEndStart {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the start poin:");
        
        int start = input.nextInt();
        
        System.out.println("Enter the end point:");
        
        int end = input.nextInt();
        
        System.out.println("The odd numbers between "+start+" and "+end+" is :");
        
        for(int x = start; x<= end; x++){
        
           if( x % 2 != 0){
               
               System.out.println(x);
           }
        }
        
        
    }
}
