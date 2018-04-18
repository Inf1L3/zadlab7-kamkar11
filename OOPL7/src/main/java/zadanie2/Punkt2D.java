/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.util.Random;

/**
 *
 * @author student
 */
public class Punkt2D {
    
    Random r = new Random();
    
    
    private int x;
    private int y;

    public Punkt2D() {
        
        x = 0;
        y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void losujPunkty()
    {
        /*
        // losowanie od x do y
        int a = r.nextInt(y - x + 1) + x;
        */
        
        /*
        // od -10 do 10
        int a = r.nextInt(21) + (-10);
        
        */
        
        int x = r.nextInt(10 - (-10) + 1) + (-10);
        int y = r.nextInt(10 - (-10) + 1) + (-10);
        
    }

    @Override
    public String toString() {
        return "Punkt2D{" + "x=" + x + ", y=" + y + '}';
    }

    

   
    
    
    
    
    
    
    
}
