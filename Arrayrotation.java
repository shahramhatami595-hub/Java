
package com.mycompany.arrayrotation;

import java.util.Scanner;

public class Arrayrotation {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
        System.out.println("Pleace enter the number of employee:");
        
        int num_em = input.nextInt();
        
       String [][] employee = new String[num_em][3];
       
       for (int x = 0;x <num_em;x++){
           
           System.out.println("Pleace enter an employee information:");
           
           for (int y = 0;y < 3;y++){
               
               if (y == 0){
                   
               System.out.println("Pleace enter employee id:");}
               
               else if(y == 1){
               
                   System.out.println("pleace enter employee name:");
               }
               else{
                   
                   System.out.println("Please enter employee position:");
               }
           employee [x][y] = input.next();
           
           
           }
       
           System.out.println("");
       
       }
       
        for (String [] emp:employee){
        int counter = 1;
          for (String e : emp){
              if (counter == 1){
                  System.out.print("ID:");
              }
              else if ( counter == 2){
              
                  System.out.print("Name:");
              }
              else{
                  System.out.print("Position:");
              }
          
          counter ++;
              System.out.print(e + "\n");
          }
            System.out.println("\n");
        }
       
         
        
    }
}
