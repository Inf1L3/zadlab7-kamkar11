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
public class Osoba {
    
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String plec;

    public Osoba(String imie, String nazwisko, String dataUrodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }
    
    
    
    public void pokDane(){
        
        System.out.println("Imię: "+imie);
        System.out.println("nazwisko: "+nazwisko);
        System.out.println("dataUrodzenia: "+dataUrodzenia);
        System.out.println("plec: "+plec);
    }

   
    
    
}
