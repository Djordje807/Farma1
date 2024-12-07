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
public class Zivotinje  {
    private String vrsta;
    private int starost; 
    private String zdravstveniStatus;
    private String rasa;
    private String vakcinacije; 
    private String rasporedHranjenja; 
    private double produktivnost;

    public Zivotinje() {
    }

    public Zivotinje(String vrsta, int starost, String zdravstveniStatus, String rasa, String vakcinacije, String rasporedHranjenja, double produktivnost) {
        this.vrsta = vrsta;
        this.starost = starost;
        this.zdravstveniStatus = zdravstveniStatus;
        this.rasa = rasa;
        this.vakcinacije = vakcinacije;
        this.rasporedHranjenja = rasporedHranjenja;
        this.produktivnost = produktivnost;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public String getZdravstveniStatus() {
        return zdravstveniStatus;
    }

    public void setZdravstveniStatus(String zdravstveniStatus) {
        this.zdravstveniStatus = zdravstveniStatus;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getVakcinacije() {
        return vakcinacije;
    }

    public void setVakcinacije(String vakcinacije) {
        this.vakcinacije = vakcinacije;
    }

    public String getRasporedHranjenja() {
        return rasporedHranjenja;
    }

    public void setRasporedHranjenja(String rasporedHranjenja) {
        this.rasporedHranjenja = rasporedHranjenja;
    }

    public double getProduktivnost() {
        return produktivnost;
    }

    public void setProduktivnost(double produktivnost) {
        this.produktivnost = produktivnost;
    }
    
    public void ucitajZivotinju(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite podateke zivotinje:");
       System.out.print("Vrsta zivotinje:");
       vrsta = sc.next();
        System.out.print("Starost zivotinje:");
        starost = sc.nextInt();
        System.out.print("Rasa :");
        rasa = sc.next();
        System.out.print("Vakcinacija da/ne:");
        vakcinacije = sc.next();
        System.out.print("Raspored hranjenja:");
        rasporedHranjenja = sc.next();
        System.out.print("Produktivnost zivotinje:");
        produktivnost = sc.nextDouble();

    }
    
    public void prizaziZivotinju(){
        System.out.println("Prikazi podatke zivotnje:");
        System.out.println("Vrsta zivotinje:" + getVrsta());
        System.out.println("Starost zivotinje:" + getStarost());
        System.out.println("Zdravstveni status:" + getVrsta() + " " + starostZivotinje());
        System.out.println("Rasa :" + getRasa());
        System.out.println("Vakcinacija:" + getVakcinacije());
        System.out.println("Raspored hranjenja:" + getRasporedHranjenja());
        System.out.println("Produktivnost:" + getVrsta() + " " + this.proveriProduktivnost());
    }
    public String proveriProduktivnost() { 
        if (produktivnost <= 3) {
            return "Nije produktivna";
        } else if 
                (produktivnost <= 7) {
            return "Srednje produktivna"; 
        } else 
        { return "Produktivna"; 
        
        } 
    }
    public String starostZivotinje(){
        if (starost <= 5){
        return getVrsta() +" je mlad/a";
        }else {
        return getVrsta() + "je star/a";
               
    }
    }
}
    

  
         

