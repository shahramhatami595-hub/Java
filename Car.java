
package com.mycompany.car;

public class Car {

    public static void main(String[] args) {
    
    Truck Lary = new Truck();
    Lary.color = "Blue";
    Lary.compony = "Benz";
    Lary.model = "200_300";
    Lary.name = "Mazda";
    Lary.tire = 8;
    Lary.year = 2010;
    Lary.setprice(12000);
        System.out.println(Lary.getprice());
    
    
    
    }
}

class Truck{
int tire;
private int price;
int year;
String name;
String model;
String color;
String compony;


public int getprice(){

return price;

}

public void setprice(int price){
    if (price >=12000 && price <= 20000){
    this.price = price;}
    else {
        System.out.println("Invalid price input the price should be between (12000 and 20000)");
    }

}


void trunon(){

    System.out.println("The truck has been truned on !");
}

void trunoff(){

    System.out.println("The truck has been truned off !");
}

void moving(){

    System.out.println("The truck is moving !");
}



}