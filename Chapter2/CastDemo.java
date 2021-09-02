//Demonstruje rzutowanie 

class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); //Rzutuje double na int
        System.out.println("Całkowity wynik dzielenia x / y: " + i);

        i = 100;
        b = (byte) i; // <- brak utraty informacji: byte umożliwia reprezentacje wartości 100
        System.out.println("Wartość zmiennej b: " + b);

        i = 257;
        b = (byte) i; // <- utrata informacji: byte nie umożliwia reprezentacji wartości 257
        System.out.println("Wartość zmiennej b: " + b);

        b = 88; //Kod ASCII litery X
        ch = (char) b; //Rzutowanie typu niezgodnego
        System.out.println("ch: " + ch);



    }
}
