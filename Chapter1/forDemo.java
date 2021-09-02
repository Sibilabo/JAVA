/*
Demonstracja pętli For

Nazwij plik fordemo.java
*/


class forDemo{
    public static void main(String args[]) {
        int count;

        //for(count = 0; count < 5; count = count + 1) 
        for(count = 0; count < 5; count++)  //Tutaj zastosowano inkrementację, zwiększanie o 1 przez ++
         System.out.println("Wartość zmiennej sterującej count: " + count);

        System.out.println("Pętla została wykonana!");
    }   
}
