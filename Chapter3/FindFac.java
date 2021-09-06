/*
Używa zagnieżdżonych pętli do znalezienia 
podzielników liczb z przedziału 2 do 100
*/

class FindFac {
    public static void main(String args[]) {

        for(int i = 2; i <= 100; i++) {
            System.out.print("Podzielnik liczby " + i + ": ");
            for(int j = 2; j < i; j++) 
                if((i % j) == 0) System.out.println(j + " ");
            System.out.println();
            
        }
    }
}
