//Wyszukuje liczby pierwsze z przedziału 2 do 100

class Prime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;
        for(i = 2; i < 100; i++) {
            isprime = true;
            
            //Sprawdza czy liczba dzieli sie bez reszty
            for(j = 2; j <= i/j; j++)
                //Jeśli tak to nie jest liczbą pierwszą
                if((i % j) == 0) isprime = false;

                if(isprime)
                  System.out.println(i + " jest liczbą pierwszą.");
        }
    }
}
