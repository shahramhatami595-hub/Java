
package com.mycompany.scorecolculation;

import java.util.Scanner;

public class Scorecolculation {

    public static void main(String[] args) {
        
   Scanner input = new Scanner(System.in);
   
        System.out.println("How many subject do you want:");
        
        int subject = input.nextInt();
        
        int [] score = new int [subject];
        
        for (int x = 0;x<score.length;x++){
            
            System.out.print("Enter a score: ");
            
            score [x] = input.nextInt();
        
        }
        
   
     int totalscore = sum(score);
     
        System.out.println("Your total score is: "+totalscore);
        
        System.out.println("Your average score is: "+(float)totalscore/subject);
        System.out.println("your max number is: "+max(score));
        System.out.println("your minmum number is: "+min (score));
        
    }
   
    static int min (int [] num){
        int min = num[0];
    for (int j : num){
    if ( j < min){
    
    min = j;
    }
    
    }
    return min;
    
    }
    
    
    static int max(int [] numbers){
        int max = numbers[0];
        for (int n : numbers){
            if(n>max)
                max = n;
        
        
        }
    
    
    return max;
    }
    
    
    
    static int sum(int [] number){
        
     int total = 0;
     
    for (int n : number){
        
        total += n;
        
    }
    return total;
    
    }
}
