// Pokazuje automatyczną konwersję typu long do double

class LtoD {
    public static void main(String args[]) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L i D: " + L + " " + D);
    }
}
