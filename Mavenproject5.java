
package com.mycompany.mavenproject5;

public class Mavenproject5 {

    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.color = "blue";
        c1.company = "Toyta";
        c1.model = "2024";
        c1.tire = 4;
        c1.max_speed = "1200 km/h";
        c1.weight = "400 kg";
        c1.power = 9000;
        
        System.out.println("The "+c1.color+" is");
        
        c1.start();
        
        c1.moving();
        
        
        
        
        
    House home = new House();
    
    home.color = "White";
    home.hight = "10m";
    home.wide = "50m";
    home.light = "white";
    home.door = 3;
    home.window = 9;
    home.person = 12;
    home.room = 8;
    
    
    home.door();
    home.window();
    home.lights();

        
        
    }
}


class Car{

String color;
String company;
String model;
String max_speed;
String weight;
int tire ;
int power;

void start(){
    System.out.println("The car truned on!");
}
void moving(){
    System.out.println("The car is moving!");
    
}
void breaks(){
    System.out.println("The car has been stopped!");
    
}
void off(){
    System.out.println("The car truned off!");
    
}



}

class House{
int person;
int room;
int window;
int door;
String light;
String color;
String hight;
String wide;

void door(){
    System.out.println("The door is open!");

}

void window(){
    System.out.println("The window is open!");
    
}

void lights(){

    System.out.println("The light is on!");

}



}