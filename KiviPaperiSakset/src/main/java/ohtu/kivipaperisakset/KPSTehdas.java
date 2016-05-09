/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author Jonas
 */
public class KPSTehdas {
    public static KPS pelaajaVsPelaaja() {
        return new KPS(new Tuomari(), new Ihminen(1), new Ihminen(2));
    }
    public static KPS pelaajaVsTekoaly() {
        return new KPS(new Tuomari(), new Ihminen(1), new Tekoaly());
    }
    public static KPS pelaajaVsParannettuTekoaly() {
        return new KPS(new Tuomari(), new Ihminen(1), new TekoalyParannettu(20));
    }
}
