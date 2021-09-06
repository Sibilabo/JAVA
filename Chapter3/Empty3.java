//Ciało pętli może być puste

class Empty3 {
    public static void main(String args[]) {
        int i;

        int sum = 0;

        //Sumuje liczby do 5
        for(i = 1; i <= 5; sum += i++) ; //Ta pętla nie ma ciała

        System.out.println("Suma wynosi " + sum);
    }
}
