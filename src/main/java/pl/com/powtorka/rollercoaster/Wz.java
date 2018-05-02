package pl.com.powtorka.rollercoaster;

public class Wz {
    private int waga;
    private int wzrost;
    private int wiek;

    public Wz(int waga, int wzrost,int wiek) {
        this.waga = waga;
        this.wzrost = wzrost;
        this.wiek=wiek;
    }

    public Wz() {
    }

    public int getWaga() {
        return waga;
    }

    public int getWzrost() {
        return wzrost;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Osoba o wadze " + waga +
                " i wzroście " + wzrost +
                " .";
    }
    /*
 * Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
  * Stwórz instrukcję warunkową ('if') który sprawdza czy osoba
  * (np. taka która  na kolejkę/rollercoaster) jest wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.
Rozwinięcie poprzedniego zadania:
Dopisz do poprzedniej aplikacji dodatkową zmienną - wiek.
Jeśli osoba jest młodsza niż 10 lat, lub starsza niż 80, to nie może wejść na kolejkę.
Dopisz/zmień do/w poprzedniej aplikacji - osoba może wejść na kolejkę jeśli jej wzrost jest od 150 do 220 cm wzrostu.
Dopisz deskryptywne wyjasnienia.
Jesli osoba nie moze wejsc na kolejke, to wypisz na konsole odpowiedni komunikat dlaczego. np.
Jesli osoba nie moze wejsc z powodu wagi, to powinien sie wypisac komunikat ze nie moze wejsc bo przekracza limit wagowy
Jesli osoba nie moze wejsc z powodu wieku, to powinien sie wypisac INNY komunikat o tym ze nie moze wejsc z powodu wieku.

*/
    public void czyNieZaCiezki(){
        if (waga<180){
            System.out.println("Zapraszmy do przejażdzki");
        }else {
            System.out.println("Przekraczasz limit wagowy");
        }
    }

    public void czyMaWIek(){
        if (wiek>10&&wiek<80){
            System.out.println("Może jechać");
        }else {
            System.out.println("Nie może jechać");
        }
    }
    public void czyWzrost(){
        if (wzrost >150&& wzrost <220){
            System.out.println("Może jechać");
        }else System.out.println("Jesteś za niski lub wysoki");
    }




}
