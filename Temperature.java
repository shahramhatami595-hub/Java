
package com.mycompany.temperature;

public class Temperature {

    public static void main(String[] args) {
        
     long result = power(2,32);
     
       long fac = factroil(5);
        System.out.println(fac);
   
    }
    
    static long power(int b, int p){
        
    if(p > 0){
        
    return b * power(b,p-1);
    
    }
    
    else {
        
    return 1;
    
    }
    
    }
    
    static long factroil(int number){
        if(number<1){
        
            return 1;
        }
        
        else{
        
        return number * factroil(number -1);
        
        }
        
    }
    
}
