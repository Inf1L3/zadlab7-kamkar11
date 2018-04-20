/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

/**
 *
 * @author student
 */
public class Punkt3D extends Punkt2D {

    private int z;
    Punkt3D array3D[];

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Punkt3D() {

        z = 0;
        array3D = new Punkt3D[100];
    }
    
 
    public int getZ() {
        return z;
    }
    /*
    @Override
    public int getX() {
        return super.getX();
    }
    @Override
    public int getY() {
        return super.getY();
    }
    */
    

    @Override
    public void losujPunkty() {
        
        super.losujPunkty();
        this.z = r.nextInt(21) + (-10);

        
    }

    @Override
    public String toString() {
        
        return super.toString()+" z = " + z;
    }

}
