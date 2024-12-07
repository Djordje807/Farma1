/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Scanner;

/**
 *
 * @author korisnik
 */
public class Zadatak extends Osoba{
private String hranjejne;
private String ciscenje;
private String muza;

    public Zadatak() {
    }

    public Zadatak(String hranjejne, String ciscenje, String muza, String ime, String prezime, int godiste) {
        super(ime, prezime, godiste);
        this.hranjejne = hranjejne;
        this.ciscenje = ciscenje;
        this.muza = muza;
    }

    public String getHranjejne() {
        return hranjejne;
    }

    public void setHranjejne(String hranjejne) {
        this.hranjejne = hranjejne;
    }

    public String getCiscenje() {
        return ciscenje;
    }

    public void setCiscenje(String ciscenje) {
        this.ciscenje = ciscenje;
    }

    public String getMuza() {
        return muza;
    }

    public void setMuza(String muza) {
        this.muza = muza;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    @Override
    public void ucitajOsobu() {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Unesite podake o poslu:");
        System.out.print("Ime nadredjenog:");
        ime = sc.next();
        System.out.print("Prezime nadredjenog:");
        prezime = sc.next();
        System.out.print("Godiste nadredjenog:");
        godiste = sc.nextInt();
        System.out.print("Za hranjenje zaduzen:");
        hranjejne = sc.next();
        System.out.print("Za muzenje zaduzen:");
        muza = sc.next();
        System.out.print("Za ciscenje zaduzen:");
        ciscenje = sc.next();
        }catch(Exception e){
            System.out.println("Greska prilikom unosa!");
        }
    }

    @Override
    public void prikaziOsobu() {
        System.out.println("Izvestaj o poslu:");
        System.out.println("Ime nadredjenog:" + getIme());
        System.out.println("Prezime nadredjenog:" + getPrezime());
        System.out.println("Godiste nadredjenog:" + getGodiste());
         System.out.println("Za hranjenje zaduzen:" + getHranjejne()+ " " + racunajZaHranjenje());
        System.out.println("Za muzenje zaduzen:" + getMuza()+ " " + racunajPlatu());
        System.out.println("Za ciscenje zaduzen:"+ getCiscenje()+ " " + racunajZaCiscenje());

    }

    @Override
    public double racunajPlatu() {
     System.out.println("Plata za muzenje:");
  return 200 * 200 + 2000;
    }
 
    public double racunajZaHranjenje(){
        System.out.println("Plata za hranjenje:");
  return 250 * 270 + 1500;
    }
    
    public double racunajZaCiscenje(){
        System.out.println("Plata za ciscenje:");
  return 300 * 270 + 3000;
    }
  


  


}