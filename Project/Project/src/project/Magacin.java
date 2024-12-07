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
public class Magacin extends UpravljanjeMagacinom{
   private int srocnaHrana;
   private int djubrivo;
   private int antibiotici;

    public Magacin() {
    }

    public Magacin(int srocnaHrana, int djubrivo, int antibiotici, int id, String nazivMagacina, double kapacitet) {
        super(id, nazivMagacina, kapacitet);
        this.srocnaHrana = srocnaHrana;
        this.djubrivo = djubrivo;
        this.antibiotici = antibiotici;
    }

    public int getSrocnaHrana() {
        return srocnaHrana;
    }

    public void setSrocnaHrana(int srocnaHrana) {
        this.srocnaHrana = srocnaHrana;
    }

    public int getDjubrivo() {
        return djubrivo;
    }

    public void setDjubrivo(int djubrivo) {
        this.djubrivo = djubrivo;
    }

    public int getAntibiotici() {
        return antibiotici;
    }

    public void setAntibiotici(int antibiotici) {
        this.antibiotici = antibiotici;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivMagacina() {
        return nazivMagacina;
    }

    public void setNazivMagacina(String nazivMagacina) {
        this.nazivMagacina = nazivMagacina;
    }

    public double getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(double kapacitet) {
        this.kapacitet = kapacitet;
    }


   
    
 public void podaciMagacina(){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Unesite podatke o magacinu:");
            System.out.print("Id:");
            id = sc.nextInt();
        System.out.print("Naziv magacina:");
        nazivMagacina = sc.next();
        System.out.print("Kapacitet magacina u m2:");
        kapacitet = sc.nextDouble();
        System.out.print("Stocna hrana u kg:");
        srocnaHrana = sc.nextInt();
        System.out.print("Djubrivo u kg:");
        djubrivo = sc.nextInt();
        System.out.print("Antibiotici u vrstama:");
        antibiotici = sc.nextInt();
        
        }catch(Exception e){
            System.err.println("Greska prilikom unasa! Pokusac opet");
        }            
 }
    public void prikazMagacina(){
        System.out.println("Prikaz magacina:");
        System.out.println("Id magacina:" +getId());
        System.out.println("Naziv magacina:" +getNazivMagacina());
        System.out.println("Kapacitet magacina u m2:" + getKapacitet());
        System.out.println("Stanje stocne hrane u kg:" + getSrocnaHrana());
        System.out.println("Stanje djubriva u magacinu:" + getDjubrivo());
        System.out.println("Vrste antibiotica:" + getAntibiotici());

    }
    
   
   
     public void upozorenjeStocnaHrana(int zalihe){
        if(zalihe < 1000){
            System.err.println("UPOZORENJE ! TREBA KUPITI HRANU");
        }else if(zalihe >= 1000 && zalihe <= 5000){
            System.out.println("OBRATIT PAZNJU NA HRANU");
        }else{
            System.out.println("HRANE IMA DOVOLJNO");
        }}
     
      public void upozorenjeDjubriva(int zalihe){
        if(zalihe < 500){
            System.err.println("UPOZORENJE ! TREBA KUPITI DJUBRIVO");
        }else if(zalihe >= 500 && zalihe <= 3000){
            System.out.println("OBRATIT PAZNJU NA DJUBRIVO");
        }else{
            System.out.println("DJUBRIVA IMA DOVOLJNO");
        }}
     
       public void upozorenjeVrstaAntibiotika(int zalihe){
        if(zalihe < 30){
            System.out.println("UPOZORENJE ! TREBA KUPITI ANTIBIOTIKE");
        }else if(zalihe >= 30 && zalihe <= 50){
            System.out.println("OBRATIT PAZNJU NA ANTIBIOTIKE");
        }else{
            System.out.println("ANTIBIOTIKA IMA DOVOLJNO");
        }}
}
    


        