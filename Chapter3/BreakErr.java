/*Ten program zawiera błąd

class BreakErr {
    public static void main(String args[]) {

        one: for(int i = 0; i < 3; i++) {
            System.out.println("Przebieg " + i + ": ");
        }

        for(int j = 0; j < 100; j++) {
            if(j == 10) break one; //ŻLE!!!
            System.out.println(j + " ");
        }
    }
}

Ponieważ pętla for opatrzona etykietą one nie obejmuje instrukcji break, instrukcja ta nie może przekazać sterowania do pętli
*/

