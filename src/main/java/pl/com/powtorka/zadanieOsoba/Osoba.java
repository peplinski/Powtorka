package pl.com.powtorka.zadanieOsoba;

public class Osoba {
    /*
    * Tworzenie obiektów – zadanie
1. Utworzenie nowego pakietu
2. Utworzenie klasy Osoba
3. Utworzenie pól : • imie:String • rok urodzenia:int
4. Utworzenie metody:  przedstawSie():void
5. Implementacja metody
6. Utworzenie 3 obiektów: 1. Ania lat 25 2. Andrzej lat 54 3. Mariola lat 68
7. Uruchomienie metody przedstawSie na każdym z obiektów
Użycie konstruktora – zadanie
1. Aktualizacja klasy Osoba
2. Dodanie konstruktora
3. Utworzenie dodatkowych 3 obiektów typu osoba za pomocą konstruktora
4. Umieszczenie wszystkich obiektów Osoba do tablicy
5. Wyświetlenie wszystkich osób z tablicy w pętli
6. * Wyświetlenie tylko pań
7. * Wyświetlenie tylko panów*/
    private String name;
    private int yearOfBirth;

    public Osoba(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {

        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return  name +"age"+ yearOfBirth;
    }

    public void introduceYourself(){
        System.out.printf(" My name is %s. \n",name);
    }
    public boolean isWoman(){
        if(this.name.endsWith("a")){
            if (this.name.equalsIgnoreCase("Kuba")){
                System.out.println(name);
            }
            System.out.println(name);
        }
        return true;
    }
    public boolean isMan(){
        if(!this.name.endsWith("a")){
            if (this.name.equalsIgnoreCase("Kuba")){
                System.out.println(name);
            }
            System.out.println(name);
        }
        return true;
    }


}
