//Opuszcza kolejny element pętli for 

class Empty2 {
    public static void main(String args[]) {
        int i;

        i = 0; //Inicjalizacja poza pętlą
        for(; i < 10; ) {
            System.out.println("przebieg " + i);
            i++; //Inkrementuje zmienną sterującą pętli
        }
    }
    
}
