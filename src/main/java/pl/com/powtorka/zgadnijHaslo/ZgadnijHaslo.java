package pl.com.powtorka.zgadnijHaslo;

import java.util.Random;
import java.util.Scanner;

public class ZgadnijHaslo {
    /*
     * 1. Zgadnij hasło – utwórz program obiektowy, który pozwala użytkownikowi zagrać w grę na poniższych zasadach:
     * a. Program losuje numer w zakresie od 1 do 100
     * b. Program pyta się użytkownika o numer
     * c. Jeśli użytkownik zgadnie numer – wypisuje ‘Gratulacje, wygrałeś!’
     * d. Jeśli nie – wypisuje użytkownikowi czy numer jest większy lub mniejszy od podanej przez użytkownika liczby
     * e. * Użytkownik sam określa zakres f. * Po 5 nieudanych próbach program wypisuje ‘Niestety, przegrałeś’
     */


    public void gra() {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        boolean isWorking = true;
        int ileRund=0;

        while (ileRund<5){
            int przedzial = rnd.nextInt(5);
            System.out.println("Podaj Liczbę od 1 do 100 :");


            for (int i = 0; i < 5; i++) {
                ileRund++;
                int zgadywanaLiczba = sc.nextInt();
                if (zgadywanaLiczba < przedzial) {
                    System.out.println("Nie trafiłeś, liczba jest za mała");
                } else if (zgadywanaLiczba > przedzial) {
                    System.out.println("Nie trafiles, liczba jest za duża");
                } else if (zgadywanaLiczba == przedzial) {
                    System.out.printf("Gratulacje, wygrałeś!");
                }
            }
        }
        System.out.println("Wykorzystałeś 5 szans. Przegrałeś!");

    }
}
