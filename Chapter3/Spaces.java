//Zalicza odstępy

class Spaces {
    public static void main(String args[]) 
        throws java.io.IOException {

            char ch;
            int spaces = 0;

            System.out.println("Wprowadź kropkę, aby zakończyć.");

            do {
                ch = (char) System.in.read();
                if(ch == ' ') spaces++;
            } while(ch != '.');

            System.out.println("Liczba odstępów: " + spaces);
        }
}
