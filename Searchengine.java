
package com.mycompany.searchengine;

import java.util.Scanner;

public class Searchengine {

    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);
    
        System.out.println("How many names do you want:");
        
        int size = input.nextInt();
        
    String [] names = new String[size];

for (int x = 0;x<names.length;x++){
    
    System.out.println("Enter a name:");
    
    names[x] = input.next();
    
}  
        System.out.print("Now enter a name to search: ");
        
        String name = input.next();

       search(names,name); 
    }
    
    static void search(String [] names,String keyword){
        
      boolean result = false;  
      
    for (String name : names){
        
        
        if (name.equalsIgnoreCase(keyword)){
            
            System.out.println("Found");
            
            result = true;
            
            break;

        }

    }
    
            
        if(!result)
            
            System.out.println("Not found!");
    
    }
}
