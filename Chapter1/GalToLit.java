/*
Program zmieniający galony na litry

Nazwij plik GalToLit.java
*/

class GalToLit {
    public static void main(String args[]) {
        double gallons; //Przechowuje liczbę galonów
        double liters; //Przechowuje liczbę litrów (po zmianie)

        gallons = 10; //10 galonów

        liters = gallons * 3.7854; //Zamienia na litry

        System.out.println(gallons + " galonów odpowiada " + liters + " litrom.");
    }
}
