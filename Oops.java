
package com.mycompany.oops;

public class Oops {

    public static void main(String[] args) {
        
        Computer c1 = new Computer("Yellow","5540","2020","Dell",12,8,12,6,15000,4);
        Computer c2 = new Computer("Black", "Persion 5540", "2026", "Dell");
      
    
    }
}

class Computer{

    String color;
    String type;
    String model;
    String company;
    int size;
    int ram;
    int cpu;
    int Hdd;
    int prise;
    int graphic;
    
    Computer(String color,String type,String model,String company,int size,int ram,int cpu,int Hdd,int prise,int graphic){
    
    this.size = size;
    this.color = color;
    this.company = company;
    this.model = model;
    this.type = type;
    this.prise = prise;
    this.ram = ram;
    this.Hdd = Hdd;
    this.graphic = graphic;
    this.cpu = cpu;
    
    
    }
    
    Computer (String color,String type,String model,String company){
        
        this.color = color;
        this.company = company;
        this.type = type;
        this.model = model;
    
    
    }
    
    
    
    void trunon(){
    
        System.out.println("The computer has been trun on!");
    }
    
    void trunoff(){
    
        System.out.println("The compute has been trun off!");
        
    }

    void boot (){
    
        System.out.println("The computer is booting!");
    }

    
    

}