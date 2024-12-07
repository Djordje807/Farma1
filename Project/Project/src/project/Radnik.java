/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import static java.lang.System.in;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author korisnik
 */
public class Radnik extends Osoba{
    private double koeficijentPlate;
    private String pozicija;
    private int brojKnjizice;
    private int brojRadnihSati;
    private List<Zadatak> zadaci;

    public Radnik() {
    }

    public Radnik(double koeficijentPlate, String pozicija, int brojKnjizice, String ime, String prezime, int godiste,int brojRadnihSati,List zadaci) {
        super(ime, prezime, godiste);
        this.koeficijentPlate = koeficijentPlate;
        this.pozicija = pozicija;
        this.brojKnjizice = brojKnjizice;
        this.brojRadnihSati = brojRadnihSati;
        this.zadaci = zadaci;
    }

    public List<Zadatak> getZadaci() {
        return zadaci;
    }

    public void setZadaci(List<Zadatak> zadaci) {
        this.zadaci = zadaci;
    }
    
    

    public double getKoeficijentPlate() {
        return koeficijentPlate;
    }

    public void setKoeficijentPlate(double koeficijentPlate) {
        this.koeficijentPlate = koeficijentPlate;
    }

    public int getBrojRadnihSati() {
        return brojRadnihSati;
    }

    public void setBrojRadnihSati(int brojRadnihSati) {
        this.brojRadnihSati = brojRadnihSati;
    }

    public double getPlata() {
        return koeficijentPlate;
    }

    public void setPlata(double koeficijentPlate) {
        this.koeficijentPlate = koeficijentPlate;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public int getBrojKnjizice() {
        return brojKnjizice;
    }

    public void setBrojKnjizice(int brojKnjizice) {
        this.brojKnjizice = brojKnjizice;
    }
    
    @Override    
    public void ucitajOsobu() {
        Scanner sc = new Scanner(in);
        try{
        System.out.println("Unesi podatke radnika:");
        System.out.print("Ime:");
        ime = sc.next();
         System.out.print("Pezime:");
        prezime = sc.next();
        System.out.print("Godiste:");
        godiste = sc.nextInt();
        System.out.print("Koeficijent plate:");
        koeficijentPlate = sc.nextDouble();
        System.out.print("Broj radnih sati:");
        brojRadnihSati = sc.nextInt();
        System.out.print("Pozicija:");
        pozicija = sc.next();
        System.out.print("Broj knjizice:");
        brojKnjizice = sc.nextInt();
        }catch(Exception e){
            System.err.println("Greska prilikom unosa !");
        }
    }

     @Override
    public double racunajPlatu() {
        System.out.println("Racnumo platu zaposlenom:");
  return koeficijentPlate * brojRadnihSati + 2000;
    }
    
    @Override
    public void prikaziOsobu() {
      System.out.println("Prikazi podatke radnika:");
      System.out.println("Ime:" + getIme());
      System.out.println("Prezime:" + getPrezime());
      System.out.println("Godiste:" + getGodiste());
      System.out.println("Broj radnih sati:" + getBrojRadnihSati());
      System.out.println("Pozicija:" + getPozicija());
      System.out.println("Broj knjizice:" + getBrojKnjizice());
         System.out.println("Plata zaposleng:" + this.racunajPlatu());
    
    } 
   
}