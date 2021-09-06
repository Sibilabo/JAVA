//Pętla z krokiem ujemnym

class DecFor {
    public static void main(String args[]) {
        int x;

        for(x = 100; x > -100; x-= 5) //<- zmienna sterująca pętli zmniejszana i=o 5 za każdym razem
            System.out.println(x);
    }
}
