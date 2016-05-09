/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author Jonas
 */
public class KPS {
    private Tuomari tuomari;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    private String pelaaja1Siirto;
    private String pelaaja2Siirto;

    public KPS(Tuomari tuomari, Pelaaja pelaaja1, Pelaaja pelaaja2) {
        this.tuomari = tuomari;
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
    }

    public void pelaa() {
        aloita();
        seuraava();
        lopeta();
    }

    private void seuraava() {
        while (onkoOkSiirto(pelaaja1Siirto) && onkoOkSiirto(pelaaja2Siirto)) {
            tuomari.kirjaaSiirto(pelaaja1Siirto, pelaaja2Siirto);
            pelaaja1Siirto = pelaaja1.annaSiirto();
            pelaaja2Siirto = pelaaja2.annaSiirto();            
            pelaaja2.asetaSiirto(pelaaja1Siirto);
        }
    }
    
    private void aloita() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        tuomari.aloitaUusiPeli();
        pelaaja1Siirto = pelaaja1.annaSiirto();
        pelaaja2Siirto = pelaaja2.annaSiirto();
    }
    
    private boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }


    private void lopeta() {
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(this.tuomari);
    }
}
