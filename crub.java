
package com.mycompany.fish;

public class crub extends sea_animal implements hunt, walking {
    int eye;
    

    @Override
    void eat() {
        System.out.println("The crunbs are eating the the fishes and other sea animals !");
       
    }

    @Override
    void breath() {
        System.out.println("The crubs are both breathing with lungs and branches !");
       
    }

    @Override
    void swim() {
        System.out.println("The crubs are swiming in the rivers and seas !");
        
    }

    @Override
    void speed() {
       
        System.out.println("The crubs are middle speeds among the sea animal");
    }

    @Override
    public void hunt() {
        System.out.println("The crubs are hunting the fishes and small  sea animals !");
    }
    @Override
    public void walking(){
        System.out.println("The crubes are walking on the land !");
    }
   
}
