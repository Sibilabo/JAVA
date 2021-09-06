//Przykład użycia instrukcji continue

class ContDemo {
    public static void main(String args[]) {
        int i;

        //Wyświetla parzyste liczby z przedziału od 0 do 100
        for(i = 0; i <= 100; i++) {
            if((i % 2) != 0) continue; //Iteracja
            System.out.println(i);
        }
    }
}
