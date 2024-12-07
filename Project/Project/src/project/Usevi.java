/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author korisnik
 */
public class Usevi {
    private String vrstaUseva;
    private LocalDate datumSadnje;
    private LocalDate ocekivaniDatumZetve; 
    private String zdravstveniStatus;
    private double prinos;

    public Usevi() {
    }

    public Usevi(String vrstaUseva, LocalDate datumSadnje, LocalDate ocekivaniDatumZetve, String zdravstveniStatus, double prinos) {
        this.vrstaUseva = vrstaUseva;
        this.datumSadnje = datumSadnje;
        this.ocekivaniDatumZetve = ocekivaniDatumZetve;
        this.zdravstveniStatus = zdravstveniStatus;
        this.prinos = prinos;
    }

    public String getVrstaUseva() {
        return vrstaUseva;
    }

    public void setVrstaUseva(String vrstaUseva) {
        this.vrstaUseva = vrstaUseva;
    }

    public LocalDate getDatumSadnje() {
        return datumSadnje;
    }

    public void setDatumSadnje(LocalDate datumSadnje) {
        this.datumSadnje = datumSadnje;
    }

    public LocalDate getOcekivaniDatumZetve() {
        return ocekivaniDatumZetve;
    }

    public void setOcekivaniDatumZetve(LocalDate ocekivaniDatumZetve) {
        this.ocekivaniDatumZetve = ocekivaniDatumZetve;
    }

    public String getZdravstveniStatus() {
        return zdravstveniStatus;
    }

    public void setZdravstveniStatus(String zdravstveniStatus) {
        this.zdravstveniStatus = zdravstveniStatus;
    }

    public double getPrinos() {
        return prinos;
    }

    public void setPrinos(double prinos) {
        this.prinos = prinos;
    }

    @Override
    public String toString() {
        return "Usevi{" + "vrstaUseva=" + vrstaUseva + ", datumSadnje=" + datumSadnje + ", ocekivaniDatumZetve=" + ocekivaniDatumZetve + ", zdravstveniStatus=" + zdravstveniStatus + ", prinos=" + prinos + '}';
    }
    
    public void UnesiUsev(){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
       System.out.println("Unesite podatke useva:");
        System.out.println("Vrsta useva:");
        vrstaUseva = sc.next();
        System.out.println("Datum sadnje:(dd/MM/yy)");
        try{
            String sadnjaString = sc.next();
            datumSadnje = LocalDate.parse(sadnjaString, formatter);
        }catch(DateTimeParseException e){
            System.out.println("Neispravan format datuma za sadnju");
        return;
        }
        System.out.println("Datum zetve:(dd/MM/yy)");
         try{
            String zetvaString = sc.next();
            ocekivaniDatumZetve = LocalDate.parse(zetvaString, formatter);
        }catch(DateTimeParseException e){
            System.out.println("Neispravan format datuma za zetvu");
        return;
        }
        System.out.println("Zdravstveni status:");
        zdravstveniStatus = sc.next();
        System.out.println("Prinois:");
        prinos = sc.nextDouble();
        
    }
    
    public void PrikaziUsev(){
        System.out.println("Vrsta useva:" + getVrstaUseva());
       // System.out.println("Datum sadjne:" + datumSadnje.format(formatter));
        // System.out.println("Datum zetve:" + getOcekivaniDatumZetve().format(formatter));
        System.out.println("Zdravstveni status:" + getZdravstveniStatus());
        System.out.println("Prinosi:" + getPrinos());
    }
    
    
}
