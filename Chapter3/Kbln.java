//Wczytuje znak z klawiatury

class Kbln {
    public static void main(String args[])
        throws java.io.IOException {
            char ch;

            System.out.print(" Wptowadź znak, a następnie naciśniej ENTER: ");

            ch = (char) System.in.read(); //Wczytuje znak z klawiatury

            System.out.println("Wprowadziłeś: " + ch);
    }
}
