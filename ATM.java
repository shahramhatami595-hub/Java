
package com.mycompany.atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       double Amount = 10000;
       
        System.out.println("What do you want to do?\n Enter 1 for geting and 2 for adding.");
        
        int action = input.nextInt();
        
        if (action == 1){
            System.out.println("How mauch do you want?");
            float moeny = input.nextFloat();
            if (moeny > Amount){
                System.out.println("You dont have enough moeny in your account!");
            }
            else if(Amount % moeny != 0){
            
                System.out.println("The amount of moeny  should be divide able by amount!");
            }
        
            else if(Amount % moeny == 0){
                
            double Amount_after = Amount - moeny;
            
                System.out.println("The amount remind from your moeny is: "+Amount_after);
            
            }
        }
       
        else if (action == 2){
            System.out.println("Enter the amount you want to add.");
            
            float add = input.nextFloat();
            
            double Amount_new = Amount + add;
            
            System.out.println("Successfuly added to your account!");
           
            System.out.println("Now yor moeny is: "+Amount_new);
        
        
        }
        
        else{
            System.out.println("Invalid input!!");
        
        }
        
    }
}
