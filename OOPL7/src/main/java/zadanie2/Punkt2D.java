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

    Punkt2D array2D[];

    Random r = new Random();

    private int x;
    private int y;

    public Punkt2D() {
        

        x = 0;
        y = 0;
        int n = 100;
        array2D = new Punkt2D[n];
        

    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

  

    public void losujPunkty() {

        // od -10 do 10
        this.x = r.nextInt(21) + (-10);
        this.y = r.nextInt(21) + (-10);

    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }

}
