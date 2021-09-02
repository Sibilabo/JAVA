//Demostruje stosowanie operatorów warunkowych

class SCops {
    public static void main(String args[]) {
        int n, d;

        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " jest dzielnikiem " + n);

            d = 0; //d otrzymuje wartość zero

        //Skoro d jest równe zero, wartość drugiego argumentu nie jest wyznaczana 
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " jest dzielnikiem " + n);

        /* Teraz ta sama operacja z użyciem zwykłego operatora
        Spowoduje błąd dzielenia przez zero
        */
        if(d != 0 & (n % d) == 0)
            System.out.println(d + " jest dzielnikiem " + n);    
    }    
}
