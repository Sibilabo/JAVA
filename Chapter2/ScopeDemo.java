//Demonstracja zasięgu bloku


class ScopeDemo {
    public static void main(String args[]) {
        int x; //Widoczna w całym kodzie metody main

        x = 10;
        if(x == 10){
            int y = 20; //Widoczna tylko w tym  bloku

            //Tutaj widoczne x i y
            System.out.println("x i y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100; //Błąd! y nie jest tu widoczne <- tutaj y poza zasięgiem

        //x jest tu nadal widoczne
        System.out.println("x jest " + x);
    }
}
