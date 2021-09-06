//Używa instrukcji break w zagnieżdżonych pętlach

class Break3 {
    public static void main(String args[]) {

        for(int i = 0; i < 3; i++) {
            System.out.println("Licznik zewnętrznej pętli: " + i);
            System.out.println("    Licznik wewnętrznej pętli: ");

            int t = 0;
            while(t < 100) {
                if(t == 10) break; //Przerywa pętle, gdy t jest równe 10
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Pętle zakończone.");
    }
}