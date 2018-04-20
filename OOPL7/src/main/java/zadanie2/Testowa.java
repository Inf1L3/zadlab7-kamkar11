/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

public class Testowa {

    public static void main(String[] args) {

        Punkt2D d2 = new Punkt2D();
        Punkt3D d3 = new Punkt3D();

        /*
        d2.losujPunkty();
        System.out.println(d2.toString());
        d3.losujPunkty();
        System.out.println(d3.toString());
         */
        //-------------------------------------------------------
        
        
        for (int i = 0; i < d2.array2D.length; i++) {
            d2.losujPunkty();
            Punkt2D n = new Punkt2D(d2.getX(), d2.getY());
            d2.array2D[i] = n;

        }
        
        System.out.println("Obiekty 2D: ");
        for (int i = 0; i < d2.array2D.length; i++) {
            System.out.println(d2.array2D[i]);
        }
         
        //-------------------------------------------------------

        for (int i = 0; i < d3.array3D.length; i++) {
            d3.losujPunkty();
            Punkt3D n = new Punkt3D(d3.getX(), d3.getY(), d3.getZ());
            d3.array3D[i] = n;

        }
        
        System.out.println("Obiekty 3D: ");
        for (int i = 0; i < d3.array3D.length; i++) {
            System.out.println(d3.array3D[i]);
        }
         
        //-------------------------------------------------------

        
        
        for (int i = 0; i < 100; i++) {
            if (d2.array2D[i].getX() == d3.array3D[i].getX() && d2.array2D[i].getY() == d3.array3D[i].getY()) {
                    System.out.println("[ "+i+"] "+d2.toString());
            }
        }
        
    }

}
