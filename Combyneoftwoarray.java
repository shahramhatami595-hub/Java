
package com.mycompany.combyneoftwoarray;

public class Combyneoftwoarray {

    public static void main(String[] args) {
        
    int [] num1 = {1,2,3,4};
    
    int [] num2 = {5,6,7,8}; 
    
    int [] num3 = new int[8];
    
    for (int i = 0; i<num1.length;i++){
        
        num3[i] = num1[i];

    }
     for (int j = 0;j<num2.length;j++){
     
     num3[num1.length+j] = num2[j];
     
     }  
        for (int n : num3){
        
            System.out.println(n);
        }
        
        
    }
}
