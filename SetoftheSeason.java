
package com.mycompany.setoftheseason;

import java.util.Scanner;

public class SetoftheSeason {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
        System.out.println("Which month is it?");
        
        int month = input.nextInt();
    if (month > 12 || month <=0 ){
    
        System.out.println("Invalid input of the month!");
    }    
    else if (month == 1 || month == 2 || month == 3 ){
    
        System.out.println("The season is Spring!");
    }  
    else if ( month == 4 ||month == 5 || month == 6 ){
    
        System.out.println("The season is Summer!");
    }    
        
    else if( month == 7 || month == 8 || month == 9){
    
        System.out.println("The season is Atumn!");
    }
   
    else {
        System.out.println("The season is Winter!");
    
    }
    
    
    
    }
}
