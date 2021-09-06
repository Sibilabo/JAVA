//Wykonuje pętle do momentu wprowadzenia litery S

class ForTest {
    public static void main(String args[]) 
        throws java.io.IOException {

            int i;

            System.out.println("Wprowadź S, żeby zakończyć.");

            for(i = 0; (char) System.in.read() != 'S'; i++)
                System.out.println("Przebieg " + i);
        }
    
}
