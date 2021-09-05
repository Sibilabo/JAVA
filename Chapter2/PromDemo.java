//Nioczekiwany wynik promocji 

class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; //OK, rzutowanie nie jest potrzebne

        b = 10;
        b = (byte) (b * b); //Rzutowanie konieczne 

        System.out.println(" i oraz b: " + i + " " + b);
    }
}
