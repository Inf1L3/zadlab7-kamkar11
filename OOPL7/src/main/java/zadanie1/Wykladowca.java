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
public class Wykladowca extends Osoba{
    
    private String przedmiot;

    public Wykladowca(String przedmiot, String imie, String nazwisko, String dataUrodzenia, String plec) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public void pokDane(){
        super.pokDane();
        System.out.println("przedmiot: "+przedmiot);
        
    }
    
    
    
    
    
}
