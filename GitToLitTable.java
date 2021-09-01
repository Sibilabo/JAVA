/*
Program wyświtla tabelę zamiany
galonów na litry 

Nazwij plik GalToLitTable.java
*/

class GitToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; //Zamiana na litry
            System.out.println(gallons + "galonów to " +
                                liters + " litrów");

            counter++;
            //W co dziesiątym wierszu wyświetlany pusty wiersz (odstęp)
            if(counter == 10) {
                System.out.println();
                counter = 0; //Zeruje licznik wierszy
            }
        }
    }
}
