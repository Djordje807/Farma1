/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author korisnik
 */
public class Zivotinja implements Comparable<Zivotinja>{
    private String vrsta; 
    private int prioritet;
    
    public Zivotinja(String vrsta, int prioritet) {
        
        this.vrsta = vrsta; this.prioritet = prioritet; 
    } 
    
    public String getVrsta() {
        return vrsta; 
    } 
    public int getPrioritet() {
        return prioritet; 
    } 
    @Override public int compareTo(Zivotinja drugaZivotinja) {
        return Integer.compare(this.prioritet, drugaZivotinja.getPrioritet());
        
    } @Override public String toString()  { 
        return "Zivotinja{" + "vrsta='" + vrsta + '\'' + ", prioritet=" + prioritet + '}'; } }
