
package com.mycompany.maxnumber;
import java.util.Scanner;
public class Maxnumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
    int max= 0;
    int number;
    
    
    for(int x =0;x<=4;x++){
        
        System.out.println("Enter a number:");
        
        number = scanner.nextInt();
       
        if(number > max){
            
           max = number;
        }
            
        

    }
        System.out.println("The max of the numbers is: "+max);  
    }
}
