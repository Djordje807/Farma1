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
public class Vlasnik {
    private String ime;
private String prezime;
private String adresa;
private int telefon;
private int godine;

    public Vlasnik() {
    }

    public Vlasnik(String ime, String prezime, String adresa, int telefon, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.telefon = telefon;
        this.godine = godine;
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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

public void unesiVlasnika(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite podatke vlasnika:");
    System.out.print("Ime:");
    ime = sc.next();
    System.out.print("Prezime:");
    prezime = sc.next();
    System.out.print("Adresa:");
    adresa = sc.next();
    System.out.print("Telofon:");
    telefon = sc.nextInt();
    System.out.print("Godine:");
    godine = sc.nextInt();
     Vlasnik v = new Vlasnik(ime, prezime, adresa, telefon, godine);
     Baza.addUser(v);
}

public void prkaziVlasnika(){
    System.out.println("podaci vlasnika su:");
    System.out.println("Ime:" + getIme());
    System.out.println("Prezime:" + getPrezime());
    System.out.println("Adresa:" + getAdresa());
    System.out.println("Telefon:" + getTelefon());
    System.out.println("Godine:" + getGodine());
   

    
}
}
