package pl.com.powtorka.zadanieOsoba;

public class Main2 {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Ania",25);
        Osoba o2 = new Osoba("Andrzej",54);
        Osoba o3 = new Osoba("Mariola",68);
        Osoba o4 = new Osoba("Krzychu",41);
        Osoba o5 = new Osoba("Magda",39);
        Osoba o6 = new Osoba("Szymon",2);
        Osoba[] tablOsob= new Osoba[]{o1,o2,o3,o4,o5,o6};
        System.out.println("Wypisz tablice");
        for (int i = 0; i <tablOsob.length ; i++) {
            System.out.println(tablOsob[i]);
        }
        System.out.println("******Wypisz Kobiety**********************");
        for (Osoba tablOsob1:tablOsob) {
            tablOsob1.isWoman();

        }





        System.out.println("*****Przedstaw sie*****************");
        for (Osoba tablOsob1:tablOsob) {
            tablOsob1.introduceYourself();

        }
//        o1.introduceYourself();
//        o2.introduceYourself();
//        o3.introduceYourself();





    }
}
