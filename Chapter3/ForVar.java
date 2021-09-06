//Deklaruje zmienną sterującą wewnątrz pętli for

class ForVar {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;

        //Wyznacza silnię liczby 5
        for(int i = 1; i <= 5; i++) { // <- zmienna i została zadeklarowana wewnątrz pętli for 
            sum += i; //i jest znane w pętli
            fact *= i;
        }
        //Tutaj i nie jest już znane

        System.out.println("Suma wymosi " + sum);
        System.out.println("Silnia wynosi " + fact);
    }
    
}
