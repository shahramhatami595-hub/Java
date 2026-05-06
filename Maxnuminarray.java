
package com.mycompany.maxnuminarray;


public class Maxnuminarray {

    public static void main(String[] args) {


    int [] numbers = {23,454,3,23,45,566787,878,764,343,23354,6};
   

   int max =numbers[0];
   
   for (int num = 1;num<numbers.length;num++){
   
   if( numbers[num]>max){
   
   max = numbers[num];
   
   
   }
        

   }
        
      System.out.println(max);    
    }
}
