

package com.mycompany.day;

import java.util.Scanner;

public class Day {

    @SuppressWarnings("empty-statement")
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
                System.out.println("What day is today inter in number! ");
        
      int  day = input.nextInt();

        System.out.println("How much day after you want!");
        
int Day_After = input.nextInt();
 int Future_Day = (day + Day_After)%7;
 
 if (Future_Day == 0){
     System.out.println("The"+Day_After+"day after is:"+"MOnday");
 }
 else if(Future_Day == 1){
     System.out.println("The"+Day_After+"day after is:"+"Thusday");
 
 }
  else if(Future_Day == 2){
     System.out.println("The"+Day_After+"day after is:"+"Winsday");
 
 }
  else if(Future_Day == 3){
     System.out.println("The"+Day_After+"day after is:"+"Thursday");
 
 }
  else if(Future_Day == 4){
     System.out.println("The"+Day_After+"day after is:"+"Friday");
 
 }
  else if(Future_Day == 5){
     System.out.println("The"+Day_After+"day after is:"+"Saturday");
 
 }
  else if(Future_Day == 6){
     System.out.println("The"+Day_After+"day after is:"+"Sunday");
 
 }
   
    }
}
