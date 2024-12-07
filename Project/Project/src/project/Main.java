
package project;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.time.LocalDate;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author korisnik
 */
public class Main {

    public static void main(String[] args) {
  /*  Farma f = new Farma();
Zivotinje z  = new Zivotinje();

        f.UcitajFarmu();
        System.out.println("");
        f.PrikaziFarmu();
        System.out.println("");
        f.DodajFarmu();
        
        System.out.println("");
        
        z.ucitajZivotinju();
        System.out.println("");
        z.prizaziZivotinju();
      System.out.println("");
        
        FarmaManger manager = new FarmaManger();
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj životinja za hranjenje:"); 
        int brojZivotinja = sc.nextInt();
        sc.nextLine(); // Potrebno za unos stringova nakon int
        for (int i = 0; i < brojZivotinja; i++) { 
            System.out.print("Unesite vrstu životinje: ");
        } String vrsta = sc.nextLine();
        System.out.print("Unesite prioritet hranjenja (manji broj znači veći prioritet): "); 
        int prioritet = sc.nextInt(); sc.nextLine(); // Potrebno za unos stringova nakon int 
     manager.dodajZivotinjuUZred(new Zivotinja(vrsta, prioritet)); 
     System.out.println("Red za hranjenje životinja po prioritetu:"); 
    manager.prikaziRedZaHranjenje();

      Usevi kukuruz = new Usevi("Kukuruz", LocalDate.of(2024, 4, 15), LocalDate.of(2024, 10, 1), "dobro", 5000);
        Usevi pšenica = new Usevi("Pšenica", LocalDate.of(2024, 9, 1), LocalDate.of(2025, 7, 1), "dobro", 3000);

        // Upravljanje usevima
        UsevManager upravljanje = new UsevManager();
        upravljanje.dodajUsev(kukuruz);
        upravljanje.dodajUsev(pšenica);

        // Prikazivanje svih useva
        System.out.println("Lista svih useva:");
        upravljanje.prikaziUseve();

        // Ažuriranje zdravlja i prinosa
        upravljanje.azurirajZdravlje("Kukuruz", "loše");
        upravljanje.azurirajPrinos("Pšenica", 3500);

        // Prikazivanje useva prema imenu
        System.out.println("Prikazivanje kukuruza:");
        upravljanje.prikaziUsevPremaNazivu("Kukuruz");
         System.out.println("");
        Radnik r = new Radnik();
        r.ucitajOsobu();
        System.out.println("");
        r.prikaziOsobu();
       
        System.out.println("");

      Zadatak zadatak = new Zadatak();
      zadatak.ucitajOsobu();
        System.out.println("");
      zadatak.prikaziOsobu();
    System.out.println("");
      Magacin m = new Magacin();
      m.podaciMagacina();
        System.out.println("");
        m.prikazMagacina();
        System.out.println("");
        m.upozorenjeStocnaHrana(0);
        m.upozorenjeDjubriva(0);
        m.upozorenjeVrstaAntibiotika(0);
        
        */
  
    /**
     *
     */
  
  Vlasnik v = new Vlasnik();
  v.unesiVlasnika();
        System.out.println();
  v.prkaziVlasnika();
        System.out.println();
        
          Baza b = new Baza();
        //a  b.obrisiVlasnika(ime, prezime);
        
      } }
        
        
      