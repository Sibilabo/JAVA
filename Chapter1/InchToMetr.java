/*
 * Program wyświtla tabelę zamiany cali na metry
 * 
 * Nazwij plik InchToMetr.java
 */

class InchToMetr {
    public static void main(String args[]) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.97; // Zamiana na metry
            System.out.println(inches + "cali to " + meters + " metrów");

            counter++;
            // W co dziesiątym wierszu wyświetlany pusty wiersz (odstęp)
            if (counter == 12) {
                System.out.println();
                counter = 0; // Zeruje licznik wierszy
            }
        }
    }
}
