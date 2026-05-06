
package com.mycompany.maxnum;

public class Maxnum {

    public static void main(String[] args) {

    int [] good = new int[100];
    
    for (int i = 0;i < good.length;i++){
    
    good[i] = (int)(Math.random()*100);
    
    }
    
    for (int num : good){
    
        System.out.println(num);
    }

    }
}
