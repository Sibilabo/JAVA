/*
 * Wprowadza metodę z parametrem obliczającą paliwo potrzebne do przejechania
 * podanego dystansu
 * 
 * 
 * class Vehicle { int passengers; int fuelcap; double lkm;
 * 
 * //Zwraca zasięg int range() { return (int) (fuelcap / lkm * 100); }
 * 
 * //Oblicza paliwo do przejechania km kilometrów double fuelneed(int km) {
 * return (double) km / 100 * lkm; } }
 * 
 * class CompFuel { public static void main(String args[]) { Vehicle minivan =
 * new Vehicle(); Vehicle sportscar = new Vehicle(); double liters; int dist =
 * 252;
 * 
 * //Przypisuje wartość składowym obiektu minivan minivan.passengers = 7;
 * minivan.fuelcap = 65; minivan.lkm = 9.1;
 * 
 * //Przypisuje wartość składowym obiektu sportscar sportscar.passengers = 2;
 * sportscar.fuelcap = 55; sportscar.lkm = 12.5;
 * 
 * liters = minivan.fuelneed(dist);
 * 
 * System.out.println("Aby przejechać " + dist +
 * " kilometrów, minivan potrzebuje " + liters + " litrów paliwa.");
 * 
 * liters = sportscar.fuelneed(dist);
 * 
 * System.out.println("Aby przejechać " + dist +
 * " kilometrów, auto sportowe potrzebuje " + liters + " litrów paliwa.");
 * 
 * } }
 */