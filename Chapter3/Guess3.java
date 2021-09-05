//Zgadywanka - wersja trzecia

class Guess3 {
    public static void main(String args[]) throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Pomyśl literę z przedziału A do Z.");
        System.out.print("Spróbuj ją odgadnąć: ");

        ch = (char) System.in.read(); // Wczytuje znak z klawiatury

        if (ch == answer) System.out.println("***DOBRZE!!!***");
        else {
            System.out.println("...Niestety nie trafiłeś...");
            if(ch < answer) System.out.println("zbyt nisko");
            //Zagnieżdżona instrukcja if
            else System.out.println("za wysoko");
        }
    }
}
