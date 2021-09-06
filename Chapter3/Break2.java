//Wczytuje dane do momentu wprowadzenia litery q

class Break2 {
    public static void main(String args[]) 
        throws java.io.IOException {

            char ch;

            for(;;) {
                ch = (char) System.in.read(); //Wczytuje znak
                if(ch == 'q') break;
            }
            System.out.println("Nacisnąłeś q!");
        }
}
