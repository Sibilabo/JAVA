
/*
Wyznacza liczbę cali sześciennych 
w mili sześciennej
*/

class Inches {
    public static void main(String args[]) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("Mila sześcienna zawiera " + ci + " cali sześceinnych.");
    }
    
}
