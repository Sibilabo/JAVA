//Zmienne typu char można traktować jak wartości całkowite


class CharArithDemo {
    public static void main(String args[]) {
        char ch;

        ch = 'X';
        System.out.println("ch zawiera " + ch);

        ch++; //inkrementacja ch - wartość typu char można inkrementować

        System.out.println("a teraz " + ch);

        ch = 90; //Przypisuje ch literę Z - zmiennej typu char można przypisać wartość całkowitą
        System.out.println("a teraz " + ch );
    }
    
}
