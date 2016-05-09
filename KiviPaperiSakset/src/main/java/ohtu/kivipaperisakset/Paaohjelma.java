package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        aloitaPeli();

    }

    private static void aloitaPeli() {
        boolean pelataanko = true;
        while (pelataanko) {
            tulostaOhjeet();
            String vastaus = scanner.nextLine();
            pelataanko = jatketaanko(vastaus);
        }
    }

    private static void tulostaOhjeet() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
    
    private static boolean jatketaanko(String valinta){
        if (valinta.endsWith("a")) {
            KPSTehdas.pelaajaVsPelaaja().pelaa();
        } else if (valinta.endsWith("b")) {
            KPSTehdas.pelaajaVsTekoaly().pelaa();
        } else if (valinta.endsWith("c")) {
            KPSTehdas.pelaajaVsParannettuTekoaly().pelaa();
        } else {
            return false;
        }
        return true;
    }
    
}
