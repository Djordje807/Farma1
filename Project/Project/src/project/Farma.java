/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author korisnik
 */
public class Farma {
    private String naziv;
private String lokacija;
private String tipFarme;
private String mlecniProizvodi;
private String zivina;
private String usevi;

    public Farma() {
    }

    public Farma(String naziv, String lokacija, String tipFarme, String mlecniProizvodi, String zivina, String usevi) {
        this.naziv = naziv;
        this.lokacija = lokacija;
        this.tipFarme = tipFarme;
        this.mlecniProizvodi = mlecniProizvodi;
        this.zivina = zivina;
        this.usevi = usevi;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public String getTipFarme() {
        return tipFarme;
    }

    public void setTipFarme(String tipFarme) {
        this.tipFarme = tipFarme;
    }

    public String getMlecniProizvodi() {
        return mlecniProizvodi;
    }

    public void setMlecniProizvodi(String mlecniProizvodi) {
        this.mlecniProizvodi = mlecniProizvodi;
    }

    public String getZivina() {
        return zivina;
    }

    public void setZivina(String zivina) {
        this.zivina = zivina;
    }

    public String getUsevi() {
        return usevi;
    }

    public void setUsevi(String usevi) {
        this.usevi = usevi;
    }

    @Override
    public String toString() {
        return "Farma:" + "naziv=" + naziv + ", lokacija=" + lokacija + ", tipFarme=" + tipFarme + ", mlecniProizvodi=" + mlecniProizvodi + ", zivina=" + zivina + ", usevi=" + usevi ;
    }
 
    

    
    
public void UcitajFarmu() {
	Scanner sc = new Scanner(System.in);
        System.out.println("UNESITE PODATKE FARME:");
	System.out.print("Naziv farme:");
        naziv =sc.nextLine();
	System.out.print("Lokacija farme:" );
         lokacija = sc.nextLine();
	System.out.print("Tip farme:" );
         tipFarme = sc.nextLine();
	System.out.print("Mlecni proizvodi:" );
        mlecniProizvodi = sc.nextLine();
	System.out.print("Zivina:" );
        zivina =  sc.nextLine();
	System.out.print("Usevi:" );
        usevi= sc.nextLine();
		
	}
public void PrikaziFarmu() {
    System.out.println("PODACI FARME SU:");
	System.out.println("Naziv farme:" + getNaziv());
	System.out.println("Lokacija farme:" + getLokacija());
	System.out.println("Tip farme :" + getTipFarme());
	System.out.println("Mlecni proizvodi:" + getMlecniProizvodi());
	System.out.println("Zivina:" + getZivina());
	System.out.println("Usevi:" + getUsevi());
}
         public void DodajFarmu() {
             Scanner sc = new Scanner(System.in);
             List<Farma> farme = new ArrayList<>(); 
             String odgovor;
             do {
                 System.out.println("Da li želite da dodate novu farmu? (da/ne)");
                 odgovor = sc.nextLine();
                 if (odgovor.equalsIgnoreCase("da")) 
                 { System.out.print("Unesite naziv farme: "); 
                 String naziv = sc.nextLine(); 
                 System.out.print("Unesite lokaciju farme: ");
                 String lokacija = sc.nextLine(); 
                 System.out.print("Unesite tip farme: ");
                 String tipFarme = sc.nextLine();
                 System.out.print("Unesite Mlecni proizvod: ");
                 String mlecniProizvodi = sc.nextLine(); 
                 System.out.print("Unesite zivinu: ");
                 String zivina = sc.nextLine();
                 System.out.print("Unesite useve farme: "); 
                 String usevi = sc.nextLine(); 
                 farme.add(new Farma(naziv, lokacija, tipFarme, mlecniProizvodi, zivina, usevi));
                 }
             }
             while (odgovor.equalsIgnoreCase("da"));
             System.out.println("Dodate farme:"); 
             for (Farma farma : farme)
             { System.out.println(farme);
             } 
         }
}