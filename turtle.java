
package com.mycompany.fish;

public class turtle extends sea_animal implements walking {

    @Override
    void eat() {
        System.out.println("The turtles are eating the grass and other sea plants !");
        
    }

    @Override
    void breath() {
        System.out.println("The turtles are breathing both with langs and branches !");
    }

    @Override
    void swim() {
        
        System.out.println("The turtles are swiming to the rivers and oceans !");
       
    }

    @Override
    void speed() {
        System.out.println("The turtles are the slowest land and sea animals !");
        
    }
    @Override
    public void walking(){
        System.out.println("The turtles are walking on the lands !");
    }
}
