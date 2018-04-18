/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

/**
 *
 * @author student
 */
public class Student extends Osoba{
    
    private int nrIndeksu;
    private String typStudiow;
    private String kierunek;
    private int rokStudow;

    public Student(int nrIndeksu, String typStudiow, String kierunek, int rokStudow, String imie, String nazwisko, String dataUrodzenia, String plec) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.nrIndeksu = nrIndeksu;
        this.typStudiow = typStudiow;
        this.kierunek = kierunek;
        this.rokStudow = rokStudow;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRokStudow() {
        return rokStudow;
    }

    public void setRokStudow(int rokStudow) {
        this.rokStudow = rokStudow;
    }
    
    

    @Override
    public void pokDane(){
        super.pokDane();
        System.out.println("nr indeksu: "+nrIndeksu);
        System.out.println("typ studiow: "+typStudiow);
        System.out.println("kierunek: "+kierunek);
        System.out.println("rok studiow: "+rokStudow);
    }

    

    
    
} 

