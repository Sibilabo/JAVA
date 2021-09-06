/*Używa pętli for do wygenerowania ciągu
1 2 4 6 8 16 ...
*/

class Progress {
    public static void main(String args[]) {
        for(int i = 1; i < 100; i += i) 
        System.out.print(i + " ");
    }
}
