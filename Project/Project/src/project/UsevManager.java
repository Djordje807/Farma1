/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author korisnik
 */
public class UsevManager {
   

    private List<Usevi> usev;

    public UsevManager() {
        usev = new ArrayList<>();
    }

    public void dodajUsev(Usevi us) {
        usev.add(us);
    }

    public void prikaziUseve() {
        for (Usevi us : usev) {
            System.out.println(us);
        }
    }

    public void azurirajZdravlje(String naziv, String novoZdravlje) {
        for (Usevi us : usev) {
            if (us.getVrstaUseva().equals(naziv)) {
                us.setZdravstveniStatus(novoZdravlje);
                System.out.println("Zdravlje za usjev " + naziv + " je ažurirano.");
            }
        }
    }

    public void azurirajPrinos(String naziv, double noviPrinos) {
        for (Usevi us : usev) {
            if (us.getVrstaUseva().equals(naziv)) {
                us.setPrinos(noviPrinos);
                System.out.println("Prinos za usjev " + naziv + " je ažuriran.");
            }
        }
    }

    public void prikaziUsevPremaNazivu(String naziv) {
        for (Usevi us : usev) {
            if (us.getVrstaUseva().equals(naziv)) {
                System.out.println(us);
                return;
            }
        }
        System.out.println("Usev sa nazivom " + naziv + " nije pronađen.");
    }
}


      