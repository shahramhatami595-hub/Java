
package com.mycompany.twosum;

public class TwoSum {

    public static void main(String[] args) {

    int [] numbers = {2,7,11,34};
    int target_num = 9;
    
    for (int i = 0;i <numbers.length;i++){
    
    for (int j = i+1;j<numbers.length;j++){
    
    if (numbers[i]+numbers[j]== target_num){
    
        System.out.println("The target number is: "+target_num+"\n and the numbers are:\n"+
         numbers[i]+" and "+numbers[j]
          +" and the indix are: "+i+"and "+j);
    
    }
    
    }
    
    }
    
        
    }
}
