
package com.mycompany.mavenproject4;

import java.util.Scanner;

public class Mavenproject4 {

    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     
     String [][] student = {{"Ali","Hashimi"},{"Shahram","Hatami"},{"Salim","Ahmadi"},{"Farid","Rahemi"}};
        
     for (int x = 0;x<student.length;x++){
         
        for (int y = 0;y<student[x].length;y++){
            
            System.out.print(student[x][y]+" ,");
        
        
        }
         System.out.println();
     
     }
        
        
        
    }
}
