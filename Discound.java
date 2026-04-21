
package com.mycompany.discound;
import java.util.Scanner;
public class Discound {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
        System.out.println("Enter the amount you pay for goods!");
       double price = input.nextDouble();
       double discound  = price * 0.1;
       double dicounded_price = price-discound;
       if (price <= 500){
       
           System.out.println("Your fee is: "+price);
       }
       else {
           System.out.println("Your fee is: "+dicounded_price);
       
       }
        
    }
}
