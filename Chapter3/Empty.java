//Niektóre części pętli for mogą być puste

class Empty {
    public static void main(String args[]) {
        int i;

        for(i = 0; i <= 10; ) { // <- brak wyrażenia iteracyjnego
                System.out.println("Przebieg " + i);
                i++; //Inkrementuje zmienną sterującą pętli
        }
    }
}
