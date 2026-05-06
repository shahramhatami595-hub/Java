
package com.mycompany.smallestindex;

public class Smallestindex {

    public static void main(String[] args) {

    int [] numbers = {2,5,4,6,8,5,4,8,5,1,3,8};

    int max = numbers[0];
    int index = 0;

    for (int i = 1;i<numbers.length;i++){
    
    if(numbers[i]>max){
    
    max = numbers[i];
    
    index = i;
    
    }
    
    
    }    
        
        System.out.println("The maximum number is :"+max+
  "and the smallest index of maximum number is : "+index);
        
    }
}
