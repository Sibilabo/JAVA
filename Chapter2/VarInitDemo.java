
//Demonstracja czasu istnienia zmiennej

class VarInitDemo {
    public static void main(String args[]) {
        int x;

        for(x = 0; x < 3; x++) {
            int y = -1; //y zostaje zainicjowana z każdym rozpoczęciem bloku,
            System.out.println("y wynosi: " + y); //dlatego zawsze wyświetla wartość -1
            y = 100;
            System.out.println("a teraz: " + y);
        }
    }
}
