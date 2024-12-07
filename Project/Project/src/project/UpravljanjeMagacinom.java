/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author korisnik
 */
public abstract class UpravljanjeMagacinom {
    protected int id;
    protected String nazivMagacina;
    protected double kapacitet;
   

    public UpravljanjeMagacinom() {
    }

    public UpravljanjeMagacinom(int id, String nazivMagacina, double kapacitet) {
        this.id = id;
        this.nazivMagacina = nazivMagacina;
        this.kapacitet = kapacitet;
        
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

 



}