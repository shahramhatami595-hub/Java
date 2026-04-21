
package com.mycompany.score;
import java.util.Scanner;
public class Score {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter your score: ");
        float score = input.nextFloat();
        if (score >15 && score <20){
            System.out.println("Great!");
        
        }
        else if(score <= 15){
            System.out.println("Accept");
        }
        else if (score> 20 ){
            System.out.println("Invalid input");
        }
        else{
        
            System.out.println("Failed");
        }
    }
}
