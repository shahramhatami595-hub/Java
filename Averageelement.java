
package com.mycompany.averageelement;

public class Averageelement {

    public static void main(String[] args) {
       
    int [] number = {2,34,45,3,4,5,4,36,7};
    
    int sum = 0;
    
    for (int x = 0;x<number.length;x++){
    
        sum += number[x];
    }
    
       int mid = (sum/number.length);
       
        System.out.println("The middle of the numbers is: "+mid);
        
        System.out.println("This numbers are bigger than middle:");
        
        for (int num :number){
        
        if (num > mid){
        
            System.out.println(num);
            
        }
        
        }
        
   
    }
}
