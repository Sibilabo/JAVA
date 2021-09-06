//Wylicza pierwiastki od 1 do 99 i błąd zaokrąglenia

class SqrRoot {
    public static void main(String args[]) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Pierwiastek kwadratowy z " + num +
                                    " wynosi " + sroot);
            
            //Wylicza błąd zaokrąglenia 
            rerr = num - (sroot * sroot);
            System.out.println("Błąd zaokrąglenia wynosi " + rerr);
            System.out.println("");
        }
    }
}
