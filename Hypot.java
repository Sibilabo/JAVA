/*
Stosuje twiedzenie Pitagorasa
do obliczenia przeciwprostokątnej,
znając długość przyprostokątnych
*/

class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);
        System.out.println("Przeciwprostokątna wynosi " + z);
    }
    
}
