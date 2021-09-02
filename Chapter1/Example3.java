/*
Program listuje różnice 
pomiędzy int i double
*/


class Example3 {
    public static void main(String args[]) {
        int v; //Deklaracja zmeinnej typu int
        double x; //Deklaracja zmiennej typu double

        v = 10; //Przypisanie zmiennej var wartość 10

        x = 10.0; //Przypisanie zmiennej x wartość 10.0
        System.out.println("Początkowa wartość zmiennej v: " + v);
        System.out.println("Początkowa wartość zmiennej x: " + x); 
        
        System.out.println(); //Wyświetla pusty wiersz

        //Dzieli wartość obu zmiennych przez 4
        v = v / 4;
        x = x / 4;

        System.out.println("v po dzieleniu: " + v);
        System.out.println("x po dzieleniu: " + x);
    }    
}
