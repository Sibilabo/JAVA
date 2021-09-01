/*
Oblicza, jak daleko uderzył piorun,
którego grom potrzebował 7,2 sekundy
na dotarcie do obserwatora
 */


class Sound {
    public static void main(String args[]) {
        double dist;

        dist = 7.2 * 330;

        System.out.println("Piorun uderzył " + dist +
                            " metrów stąd.");
    }
}
