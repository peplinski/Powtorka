package pl.com.powtorka;

public class Choinka {


    public static void main(String[] args) {

        //choinka
        int liczba = 10;
        for (int i = 0; i <= liczba; i++) {

            for (int j = i; j < liczba; j++) {
                System.out.print(" ");
            }

            for (int z = 0; z <= i - 1; z++)
                System.out.print("*");
            System.out.print("");

            for (int k = liczba - i; k < liczba; k++)
                System.out.print("*");
            System.out.println();

        }
        System.out.println();

//prostokat
        int wysokosc = 5;
        for (int i = 0; i <= wysokosc; i++) {
            System.out.print(" ");
            for (int j = 0; j < wysokosc; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //trojkat
        for (int i = 0; i <= 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
        }
    }
}

