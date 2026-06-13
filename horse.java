
package com.mycompany.oopp;

public class horse extends animal{
    
    @Override
    void eat(){
        System.out.println("The horse is eating the grass");
    }
    @Override
    void run(){
        System.out.println("The horse is running");
    }
    @Override
    void sleep(){
        System.out.println("The horse is sleepping");
    }
    @Override
    void breath(){
        System.out.println("The horse is brething");
    }
    void ride(){
    
        System.out.println("The man is ridding the horse");
    }
    
}
