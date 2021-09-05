//Demonstracja drabinki if-else-if

class Ladder {
    public static void main(String args[]) {
        int x;

        for(x = 0; x < 6; x++) {
            if(x == 1)
                System.out.println("x równe 1");
            else if(x == 2)
                System.out.println("x równe 2");
            else if(x == 3)
                System.out.println("x równe 3");
            else if(x == 4)
                System.out.println("x równe 4");
            else
                System.out.println("x nie należy do przedziału od 1 do 4"); // <- instukcja wykonywana domyślnie
        }
    }
}
