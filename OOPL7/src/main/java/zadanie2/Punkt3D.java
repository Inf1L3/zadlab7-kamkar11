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
public class Punkt3D extends Punkt2D{
    
    private int z;

    public Punkt3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }
    
    @Override
     public void losujPunkty()
    {
        super.losujPunkty();
        int x = r.nextInt(10 - (-10) + 1) + (-10);
        int y = r.nextInt(10 - (-10) + 1) + (-10);
        int z = r.nextInt(10 - (-10) + 1) + (-10);
    }

    @Override
    public String toString() {
        super.toString();
        return "Punkt3D{" + "z=" + z + '}';
    }
     
    
    
}
