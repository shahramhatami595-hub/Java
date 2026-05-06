
package com.mycompany.shuffling;

public class Shuffling {

    public static void main(String[] args) {
    
    int [] numbers = {1,2,3,4,5,6,7,8,9,10};
    
    for (int i = 0;i<numbers.length;i++){
        
      int j = (int)(Math.random()*numbers.length);
      
      int temp = numbers[i];
      
      numbers[i] = numbers[j];
      
      numbers[j] = temp;
    
    }    
     for (int num : numbers){
     
     
         System.out.println(num);
     
     }   
        
        
    }
}
