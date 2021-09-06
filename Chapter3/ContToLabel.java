//Przykład użycia instrukcji continue z etykietą

class ContToLabel {
    public static void main(String args[]) {
        outerloop:
            for(int i = 1; i < 10; i++) {
                System.out.println("\nPrzebieg pętli zewnętrznej " + i +
                                    ", pętli wewnętrznej: ");
                for(int j = 1; j < 10; j++) {
                    if(j == 5) continue outerloop; //Kontynuuje pętlę zewnętrzną
                    System.out.println(j);
                }                    
            }
    }
}
