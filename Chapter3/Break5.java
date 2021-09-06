//Kolejny przykład użycia instrukcji break z etykietą

class Break5 {
    public static void main(String args[]) {

        done:
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    for(int k = 0; k <10; k++) {
                        System.out.println(k + " ");
                        if(k == 5) break done; //Skok do done
                    }
                    System.out.println("Za pętlą k"); //Nie zostanie wykonane
                }
                System.out.println("Za pętlą j"); //Nie zostanie wykonane
            }
            System.out.println("Za pętlą i");
    }
}
