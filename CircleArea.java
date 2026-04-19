
package com.mycompany.circlearea;
import java.util.Scanner;
public class CircleArea {

    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     
      System.out.println("Please enter the radius of the circle as an integer");
      
     int redius = input.nextInt();
       
     float pi = 3.14f;
     
     double area = redius * redius *pi;
     
        System.out.println("The area of the redius "+redius+" is:"+area);
        
        
       
        
    }
}
