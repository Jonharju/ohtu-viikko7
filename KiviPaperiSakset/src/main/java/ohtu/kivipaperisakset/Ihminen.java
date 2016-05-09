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
public class Ihminen implements Pelaaja{
    private static final Scanner scanner = new Scanner(System.in);
    private int kumpiPelaaja;
    
    public Ihminen(int kumpi){
        this.kumpiPelaaja = kumpi;
    }
    
    @Override
    public String annaSiirto() {
        if (kumpiPelaaja == 1){
            System.out.print("Ensimmäisen pelaajan siirto: ");
        } else { 
            System.out.print("Toisen pelaajan siirto: ");
        }
        return scanner.nextLine();
    }
    
    @Override
    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
    
}
