
package com.mycompany.threedimintal;

import java.util.Scanner;
        
public class Threedimintal {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
    int [] numbers = {12,3,5,78,8,23,90,15};
    int max = numbers[0];
    int low = numbers[0];
    int sum = 0;
    int mid = 0;
    
    for (int i = 0;i < numbers.length;i++){
    
     if (numbers[i]> max){
     
       max = numbers[i];
     }
     if(numbers[i]<low){
     
     low = numbers[i];
     
     } 
     
     sum += numbers[i];
     
     mid = (sum/numbers.length);
     
        
    }
        System.out.println("The maximum number in this array is: "+max);
        
        System.out.println("The minmum number in this array is: "+low);
        
        System.out.println("The sum of the numbers are: "+sum);
        
        System.out.println("The mid of the numbers are: "+mid);
        
        
    }
}
