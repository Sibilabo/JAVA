/***Ten program nie zostanie skompilowany***

class DtoL {
    public static void main(String args[]) {
        long L;
        double D;

        D = 100123285.0;
        L = D //Niedozwolone!!! <-brak automatycznej konwersji z long to double

        System.out.println("L i D: " + L + " " + D);
    }
}
*/