/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicedemo;

import java.util.Random;

/**
 *
 * @author phamq
 */
public class Dice {
    private int n;

    public Dice(){
        
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void playGame(){
        Random rd = new Random();
       
        int number1 = 1 + rd.nextInt(6);
        
        System.out.println(number1);
    }
    
    
    
}
