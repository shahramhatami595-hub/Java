
package com.mycompany.fish;

public class shark extends sea_animal implements hunt {

    @Override
    void eat() {
     
        System.out.println("The sharks are eating fishs and sea animals");
    }

    @Override
    void breath() {
        System.out.println("The sharks are breathing with branches !");
        
    }

    @Override
    void swim() {
    
        System.out.println("The sharks are swiming in the oceans and big rivers!");
    }
    
    @Override
void speed(){

    System.out.println("The sharks are the fastest animals in the rivers and oceans !");
}

void attack(){
    System.out.println("The sharks are attacking to the humands and other sea animals !");
}

    @Override
    public void hunt() {
        System.out.println("The sharks are hunting the the gint fishes and other sea animals !");
    }
}
