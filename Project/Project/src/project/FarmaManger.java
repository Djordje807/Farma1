/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.PriorityQueue;

/**
 *
 * @author korisnik
 */
public class FarmaManger {
 private PriorityQueue<Zivotinja> redZaHranjenje;
 
 public FarmaManger() { 
this.redZaHranjenje = new PriorityQueue<>();
}


public void dodajZivotinjuUZred(Zivotinja zivotinja) { 
redZaHranjenje.add(zivotinja); }
public void prikaziRedZaHranjenje() {
    
    while (!redZaHranjenje.isEmpty()) {
        Zivotinja zivotinja = redZaHranjenje.poll();
        System.out.println(zivotinja); } }
}