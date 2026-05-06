
package com.mycompany.copyingarray;

public class Copyingarray {

    public static void main(String[] args) {

    int [] source = {1,2,3,4,5,6,7};
    
    int [] target = new int[source.length];
    
    for (int i = 0;i<source.length;i++){
        
    target[i]  = source[i];
    
        System.out.println(source[i]);
    
    }
    for (int num:target){
    
        System.out.println(num);
        
    } 
   
    }
}
