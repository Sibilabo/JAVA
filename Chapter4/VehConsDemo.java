//Wprowadza konstruktor klasy vehicle

class Vehicle {
    int passengers; //Liczba pasażerów
    int fuelcap; //Pojemność zbiornika paliwa w litrach
    double lkm; //Zużycie paliwa na 100 km

    //Konstruktor klasy Vehicle
    Vehicle(int p, int f, double l) {
        passengers = p;
        fuelcap = f;
        lkm = l;
    }

    //Zwraca zasięg
    int range() {
        return (int) (fuelcap / lkm * 100);
    }

    //Oblicza paliwo potrzebne do przejechania km kilometrów
    double fuelneeded(int km) {
        return (double) km / 100 * lkm;
    }

}

class VehConsDemo {
    public static void main(String args[]) {

        //Tworzy obiekty Vehicle
        Vehicle minivan = new Vehicle(7, 65, 9.1);
        Vehicle sportscar = new Vehicle(2, 55, 12.5);
        double liters;
        int dist = 252;

        liters = minivan.fuelneeded(dist);

        System.out.println("Aby przejechać " + dist + " kilometrów, minivan potrzebuje " + 
                            liters + " litrów paliwa.");

        liters = sportscar.fuelneeded(dist);

        System.out.println("Aby przejechać " + dist + " kilometrów, auto sportowe potrzebuje " 
                            + liters + " litrów paliwa.");
    }
}
