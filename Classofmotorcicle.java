
package com.mycompany.classofmotorcicle;

public class Classofmotorcicle {

    public static void main(String[] args) {
        
        Motorcycle m1 = new Motorcycle();
        
        m1.color = "white";
        m1.company = "Honda";
        m1.model = "2010";
        m1.maxspeed = 180;
        m1.tire = 2;
        m1.weight = 190;
        

        
    }
}

class Motorcycle{
    String color;
    String model;
    String company;
    int tire;
    int weight;
    int maxspeed;
    
    void doBreak(){
        System.out.println("The motorcycle breaked!");
        
    }
    void start(){
    
        System.out.println("The motorcycle started!");
    }

void off(){

    System.out.println("The motorcycle has been turned off!");
}
    
void moving(){
    System.out.println("The motorcycle is moving!");
}

}